package com.example.smic.licenses.models;

import lombok.Data;

@Data
public class License {
    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;
}
