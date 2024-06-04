package com.zenithnxt.springBootRest.service.impl;

import com.zenithnxt.springBootRest.exception.CloudVendorNotFound;
import com.zenithnxt.springBootRest.model.CloudVendor;
import com.zenithnxt.springBootRest.repository.CloudVendorRepository;
import com.zenithnxt.springBootRest.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImple implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImple(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudeVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "SUCCESS";
    }

    @Override
    public String updateCloudeVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "SUCCESS";
    }

    @Override
    public String deleteCloudeVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "DELETED";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {

        if (cloudVendorRepository.findById(vendorId).isEmpty())
            throw  new CloudVendorNotFound("Requested Cloud Vendor Does not exist");

        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
