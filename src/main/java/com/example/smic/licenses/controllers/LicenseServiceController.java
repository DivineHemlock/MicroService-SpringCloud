package com.example.smic.licenses.controllers;

import com.example.smic.licenses.models.License;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {
    @GetMapping("/{licenseId}")
    public License getLicense(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId){
        License license = new License();
        license.setId(licenseId);
        license.setProductName("Teleco");
        license.setLicenseType("Seat");
        license.setOrganizationId("TestOrg");
        return license;
    }

}
