package com.firstdata.temp.service;


import com.firstdata.fs.test.BeanTester;
import org.junit.Test;

public class ModelTest {

    private static final Class[] ALL_MODEL_CLASSES = new Class[]{
            TestRequest.class, TestResponse.class
    };

    @Test
    public void testAllGettersAndSettersAndEquals() throws Exception {
        BeanTester.testAllBeansGetterSettersAndEquals(ALL_MODEL_CLASSES);
    }

}

