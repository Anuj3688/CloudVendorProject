package com.zenithnxt.springBootRest.Repository;

import com.zenithnxt.springBootRest.model.CloudVendor;
import com.zenithnxt.springBootRest.service.impl.CloudVendorServiceImple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.swing.*;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class CloudVendorApiTest {

    @Autowired
    private CloudVendorServiceImple cloudVendorServiceImple;

    @Test
    public void testFindAll() {
        //Arrange the Element
        CloudVendor cloudVendor = CloudVendor.builder()
                .vendorId("21")
                .vendorAddress("MongoLa")
                .vendorName("Rahul Srivastav")
                .vendorPhoneNumber("92842")
                .build();

        //Act
        String savedVendor  = cloudVendorServiceImple.createCloudeVendor(cloudVendor);

        //Assert
        Assertions.assertNotNull(savedVendor);
//        Assertions.assertEquals(savedVendor,cloudVendor);

    }
}
