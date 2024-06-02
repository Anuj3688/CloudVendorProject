package com.zenithnxt.springBootRest.controller;

import com.zenithnxt.springBootRest.model.CloudVendor;
import com.zenithnxt.springBootRest.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiController {

    CloudVendorService cloudVendorService;

    public CloudApiController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

//    For Specific Id only
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudeVendor(cloudVendor);
        return "Cloud Vendor Created with Success";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudeVendor(cloudVendor);
        return "Cloud Vendor Updated with Success";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorid){
        cloudVendorService.deleteCloudeVendor(vendorid);
        return "Deletion with success";
    }
}
