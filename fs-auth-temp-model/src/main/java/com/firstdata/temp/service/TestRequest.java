package com.firstdata.temp.service;

import com.firstdata.fs.model.BasicFsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class TestRequest extends BasicFsRequest {

    @ApiModelProperty
    private String inputField;

    public String getInputField() {
        return inputField;
    }

    public void setInputField(String inputField) {
        this.inputField = inputField;
    }
}
