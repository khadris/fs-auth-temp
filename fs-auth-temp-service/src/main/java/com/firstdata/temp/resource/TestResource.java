package com.firstdata.temp.resource;

import com.firstdata.fs.core.AbstractService;
import com.firstdata.temp.service.TestRequest;
import com.firstdata.temp.service.TestResponse;
import com.firstdata.temp.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Api(tags = "Temp Project")
@Stateless
public class TestResource extends AbstractService<TestRequest, TestResponse> {

    @EJB
    private TestService testService;

    @POST
    @Path("/fs/temp/v1/myservice")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "TEST API DETAILS")
    @Override
    public TestResponse sync(TestRequest request) {
        return testService.testServiceMethod(request);
    }
}
