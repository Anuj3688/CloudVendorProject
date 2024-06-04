package com.zenithnxt.springBootRest.controller;

import com.zenithnxt.springBootRest.model.CloudVendor;
import com.zenithnxt.springBootRest.response.ResponseHandler;
import com.zenithnxt.springBootRest.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiController {

    CloudVendorService cloudVendorService;

    public CloudApiController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

//    For Specific id only
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return ResponseHandler.responseBuilder(
                "Connection Success",
                HttpStatus.ACCEPTED,
                cloudVendorService.getCloudVendor(vendorId)
        );
    }

    @GetMapping
    public ResponseEntity<Object> getAllCloudVendorDetails(){
        return ResponseHandler.responseBuilder(
                "Connection Success",
                HttpStatus.ACCEPTED,
                cloudVendorService.getAllCloudVendor()
        );
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
