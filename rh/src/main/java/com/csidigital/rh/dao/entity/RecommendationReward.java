package com.csidigital.rh.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.csidigital.rh.shared.enumeration.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class RecommendationReward {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    private double amount;
    @Enumerated(EnumType.STRING)
    private RewardType rewardType;

}

