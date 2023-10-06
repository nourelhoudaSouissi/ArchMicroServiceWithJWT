package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.shared.enumeration.RewardType;
import lombok.Data;

@Data
public class RecommendationRewardRequest {

    private double amount;
    private RewardType rewardType;
}
