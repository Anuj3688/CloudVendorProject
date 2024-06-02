package com.zenithnxt.springBootRest.service;

import com.zenithnxt.springBootRest.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudeVendor(CloudVendor cloudVendor);
    public String updateCloudeVendor(CloudVendor cloudVendor);
    public String deleteCloudeVendor(String vendorId);
    public CloudVendor getCloudVendor(String vendorId);
    public List<CloudVendor> getAllCloudVendor();
}
