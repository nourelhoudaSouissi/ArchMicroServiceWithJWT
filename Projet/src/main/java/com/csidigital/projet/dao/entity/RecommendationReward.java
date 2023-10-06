package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.RewardType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

