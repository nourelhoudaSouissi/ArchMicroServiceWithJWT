package com.csidigital.projet.shared.dto.response;
import com.csidigital.projet.shared.enumeration.LanguageLevel;
import lombok.Data;
@Data
public class LanguageResponse {


    private Long Id;
    private String language;
    private LanguageLevel languageLevel;
    private String additionalInformation;
    private Long technicalFileId ;
}
