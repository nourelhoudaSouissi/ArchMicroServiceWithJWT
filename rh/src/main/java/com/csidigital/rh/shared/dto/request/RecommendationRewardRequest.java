package com.csidigital.rh.shared.dto.request;

import com.csidigital.rh.shared.enumeration.RewardType;
import lombok.Data;

@Data
public class RecommendationRewardRequest {

    private double amount;
    private RewardType rewardType;
}
