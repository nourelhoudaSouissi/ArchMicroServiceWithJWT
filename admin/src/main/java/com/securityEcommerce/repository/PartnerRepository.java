package com.securityEcommerce.repository;


import com.securityEcommerce.models.Partner;
import com.securityEcommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PartnerRepository extends JpaRepository<Partner,Long> {

    List<Partner> findByUserpId(Long userId);
    Optional<Partner> findByIdAndUserpId(Long id, Long userId);
    void deleteByIdAndUserpId(Long id, Long userId);

    List<Partner> findByUserp(User user);
}

