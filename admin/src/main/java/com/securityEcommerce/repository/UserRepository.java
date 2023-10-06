package com.securityEcommerce.repository;

import java.util.List;
import java.util.Optional;

import com.securityEcommerce.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securityEcommerce.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByUsername(String username);
  List<User> findByUsernameContainingIgnoreCase(String username);
  Boolean existsByUsername(String username);
   User findByConfirmationToken ( String confirmationToken);
  Boolean existsByEmail(String email);
  User findByEmail(String emial);
  User findByPasswordResetToken(String passwordResetToken);




}
