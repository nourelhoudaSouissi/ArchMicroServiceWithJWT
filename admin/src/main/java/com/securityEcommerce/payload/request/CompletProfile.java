package com.securityEcommerce.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class CompletProfile {
    private String username;
    private String fullname;

    private long phone;

    private String adresse;

    private String website;


}
