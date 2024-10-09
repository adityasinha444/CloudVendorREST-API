package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    @GetMapping("/{vendorID}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorID) {
        return new CloudVendor(vendorID, "Vendor 1", "Address One", "xxxx");
    }
}
