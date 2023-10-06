package com.csidigital.management.mapper;

import com.csidigital.dao.entity.ProfileUpdated;
import com.csidigital.shared.dto.request.ProfileUpdatedRequest;
import com.csidigital.shared.dto.response.ProfileUpdatedResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component

public class RequestedProfileMapper {
    public ProfileUpdatedResponse toRequestedProfileResponseDto(ProfileUpdated profileUpdated){
        ProfileUpdatedResponse profileUpdatedResponse = new ProfileUpdatedResponse();
        BeanUtils.copyProperties(profileUpdated, profileUpdatedResponse);
        return profileUpdatedResponse;
    }
    public ProfileUpdated torequestedProfile(ProfileUpdatedRequest profileUpdatedRequest){
        ProfileUpdated profileUpdated = new ProfileUpdated();
        BeanUtils.copyProperties(profileUpdatedRequest, profileUpdated);
        return profileUpdated;}
}
