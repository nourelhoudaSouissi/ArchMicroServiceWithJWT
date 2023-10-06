package com.securityEcommerce.security.services;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

import com.securityEcommerce.models.Customer;
import com.securityEcommerce.models.User;
import com.securityEcommerce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.securityEcommerce.exception.TokenRefreshException;
import com.securityEcommerce.models.RefreshToken;
import com.securityEcommerce.repository.RefreshTokenRepository;
import com.securityEcommerce.repository.UserRepository;

@Service
public class RefreshTokenService {
  @Value("${bezkoder.app.jwtRefreshExpirationMs}")
  private Long refreshTokenDurationMs;

  @Autowired
  private RefreshTokenRepository refreshTokenRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private CustomerRepository customerRepository;

  public Optional<RefreshToken> findByToken(String token) {
    return refreshTokenRepository.findByToken(token);
  }

  public RefreshToken createRefreshTokenForUser(long userId) {
    Optional<User> optionalUser = userRepository.findById(userId);
    if (optionalUser.isEmpty()) {
      throw new UsernameNotFoundException("User not found with id: " + userId);
    }

    User user = optionalUser.get();
    RefreshToken refreshToken = new RefreshToken();
    refreshToken.setUser(user);
    refreshToken.setToken(UUID.randomUUID().toString());
    refreshToken.setExpiryDate(Instant.now().plusMillis(86400000)); // Set expiry date to 24 hours from now

    return refreshTokenRepository.save(refreshToken);
  }

  public RefreshToken createRefreshTokenForCustomer(long customerId) {
    Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
    if (optionalCustomer.isEmpty()) {
      throw new UsernameNotFoundException("Customer not found with id: " + customerId);
    }

    Customer customer = optionalCustomer.get();
    RefreshToken refreshToken = new RefreshToken();
    refreshToken.setCustomer(customer);
    refreshToken.setToken(UUID.randomUUID().toString());
    refreshToken.setExpiryDate(Instant.now().plusMillis(86400000)); // Set expiry date to 24 hours from now

    return refreshTokenRepository.save(refreshToken);
  }

  public RefreshToken verifyExpiration(RefreshToken token) {
    if (token.getExpiryDate().compareTo(Instant.now()) < 0) {
      refreshTokenRepository.delete(token);
      throw new TokenRefreshException(token.getToken(), "Refresh token was expired. Please make a new signin request");
    }

    return token;
  }
  public RefreshTokenService(RefreshTokenRepository refreshTokenRepository,
                             UserRepository userRepository,
                             CustomerRepository customerRepository) {
    this.refreshTokenRepository = refreshTokenRepository;
    this.userRepository = userRepository;
    this.customerRepository = customerRepository;
  }
  @Transactional
  public int deleteByUserId(Long userId) {
    return refreshTokenRepository.deleteByUser(userRepository.findById(userId).get());
  }

  @Transactional
  public int deleteByCustomerId(Long CustomerId) {
    return refreshTokenRepository.deleteByCustomer(customerRepository.findById(CustomerId).get());
  }
}
