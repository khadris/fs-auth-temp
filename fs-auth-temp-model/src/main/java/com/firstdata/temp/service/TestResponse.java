package com.firstdata.temp.service;

import com.firstdata.fs.model.BasicFsResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class TestResponse extends BasicFsResponse {

    @ApiModelProperty
    private String outputField;

    public String getOutputField() {
        return outputField;
    }

    public void setOutputField(String outputField) {
        this.outputField = outputField;
    }
}
