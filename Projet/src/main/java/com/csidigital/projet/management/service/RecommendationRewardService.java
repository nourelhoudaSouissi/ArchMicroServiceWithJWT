package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.RecommendationRewardRequest;
import com.csidigital.projet.shared.dto.response.RecommendationRewardResponse;

import java.util.List;

public interface RecommendationRewardService {
    RecommendationRewardResponse createRecommendationReward(RecommendationRewardRequest request);
    List<RecommendationRewardResponse> getAllRecommendationRewards();
    RecommendationRewardResponse getRecommendationRewardById(Long id);

    RecommendationRewardResponse updateRecommendationReward(RecommendationRewardRequest request, Long id);

    void deleteRecommendationReward(Long id);

}
