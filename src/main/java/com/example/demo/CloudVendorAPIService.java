package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
	CloudVendor cloudVendor;
	
    @GetMapping("/{vendorId}")  // Fixed PathVariable from vendorID to vendorId
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId)
    {            	// Fixed parameter name from vendorID to vendorId
    	
        return  cloudVendor;
        		//new CloudVendor(vendorId, "Vendor 1", "Address One", "xxxx");
    }
    
    @PostMapping 
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
    	this.cloudVendor = cloudVendor;
    	return "Cloud Vendor Created  Successfully";
    	
    }
    	

}