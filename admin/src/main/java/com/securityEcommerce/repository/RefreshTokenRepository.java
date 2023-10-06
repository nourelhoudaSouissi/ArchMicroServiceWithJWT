package com.securityEcommerce.repository;

import java.util.Optional;

import com.securityEcommerce.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.securityEcommerce.models.RefreshToken;
import com.securityEcommerce.models.User;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
  Optional<RefreshToken> findByToken(String token);

  @Modifying
  int deleteByUser(User user);
  @Modifying
  int deleteByCustomer(Customer customer);


}
