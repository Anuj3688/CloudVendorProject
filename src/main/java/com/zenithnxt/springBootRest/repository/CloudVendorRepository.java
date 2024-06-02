package com.zenithnxt.springBootRest.repository;

import com.zenithnxt.springBootRest.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor , String> {
    //For Custom Methods
}
