package com.github.codingricky.marvel.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Result<T> {
    private int code;
    private String status;
    private String etag;
    private Container<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Container<T> getData() {
        return data;
    }

    public void setData(Container<T> data) {
        this.data = data;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
