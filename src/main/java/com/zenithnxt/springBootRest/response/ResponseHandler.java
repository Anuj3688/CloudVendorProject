package com.zenithnxt.springBootRest.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Object> responseBuilder(
            String message, HttpStatus httpStatus , Object dataResult
    ){
        Map<String,Object> response = new HashMap<>();
        response.put("message",message);
        response.put("status",httpStatus);
        response.put("data",dataResult);
        return new ResponseEntity<>(response,httpStatus);
    }
}
