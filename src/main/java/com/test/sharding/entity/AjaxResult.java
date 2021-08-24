package com.test.sharding.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="返回结果")
public class AjaxResult<T> {

    public static final int GENERAL_ERROR = 9000;
    public static final int ARGS_ERROR = 10000;
    public static final int DUPLICATE_ERROR = 10001;
    public static final int FILE_UPLOAD_ERROR = 10002;
    public static final int DB_ERROR = 10003;
    public static final int CONFIRM = 8000;//此状态码返回前端，用于生成确认框

    // 返回状态码
    @ApiModelProperty(value="返回状态码 ")
    private int code = 0;

    // 返回的中文消息
    @ApiModelProperty(value="返回的中文消息 ")
    private String message = "success";

    // 成功时携带的数据
    @ApiModelProperty(value="成功时携带的数据 ")
    private T data;

    // 返回状态码
    @ApiModelProperty(value="返回结果 ")
    private String result = "success";

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public int getCode() {
        return code;
    }

    public AjaxResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public AjaxResult<T> setData(T data) {
        this.data = data;
        return this;
    }

    public AjaxResult<T> error(String message) {
        this.result = "error";
        this.message = message;
        this.data = null;
        this.code = 0;
        return this;
    }

    public AjaxResult<T> success(T data) {
        this.result = "success";
        this.message = "success";
        this.data = data;
        this.code = 0;
        return this;
    }

    public AjaxResult(){
    }

    public AjaxResult(T data, int code, String message, String result){
        this.message = message;
        this.data = data;
        this.code = code;
        this.result = result;
    }
}
