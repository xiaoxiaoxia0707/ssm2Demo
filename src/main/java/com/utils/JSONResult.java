package com.utils;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/25.
 */
public class JSONResult<T> implements Serializable{
    private T data;
    private String message;
    private String url;
    private int statusCode;
    private boolean success;
    public JSONResult(){
        data=null;
        message="success";
        statusCode=0;
        success=false;
    }
    public JSONResult(T data){
        this.data=data;
    }
    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
