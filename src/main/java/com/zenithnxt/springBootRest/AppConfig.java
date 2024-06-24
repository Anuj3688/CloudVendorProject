package com.zenithnxt.springBootRest;

import com.zenithnxt.springBootRest.service.CloudVendorService;
import com.zenithnxt.springBootRest.service.impl.CloudVendorServiceImple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CloudVendorService cloudVendorServiceImple() {
        return new CloudVendorServiceImple();
    }
}
