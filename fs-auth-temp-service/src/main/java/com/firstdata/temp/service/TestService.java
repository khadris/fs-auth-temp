package com.firstdata.temp.service;


import javax.ejb.Stateless;

@Stateless
public class TestService {

    public TestResponse testServiceMethod(TestRequest request) {

        //TODO - BUSINESS LOGIC TO BE IMPLEMENTED HERE
        String inputField = request.getInputField();
        TestResponse response = new TestResponse();

        response.setOutputField(inputField + " PROCESSED");
        return response;
        
    }
}
