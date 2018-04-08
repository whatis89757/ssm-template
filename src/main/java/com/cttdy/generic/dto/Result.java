package com.cttdy.generic.dto;

public class Result<T> {
    private int code;
    private T data;
    private String error;

    public Result() {
    }

    public Result(int code, T data, String error) {
        this.code = code;
        this.data = data;
        this.error = error;
    }

}
