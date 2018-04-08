package com.cttdy.generic.dto;

public class ResultCode {
    /**
     * 成功
     */
    public final static int SUCCESS = 0;


    /**
     * 未知错误
     */
    public final static int UNKNOW_ERROR = 9999;

    /**
     * 应用级错误
     */
    public final static int APPLICATION_ERROR = 9000;

    /**
     * 参数验证错误
     */
    public final static int VALIDATE_ERROR = 9001;

    /**
     * 业务逻辑验证错误
     */
    public final static int SERVICE_ERROR = 9002;

    /**
     * 缓存访问错误
     */
    public final static int CACHE_ERROR = 9003;

    /**
     * 数据访问错误
     */
    public final static int DAO_ERROR = 9004;

    /**
     * 未认证
     */
    public final static int UNAUTHORIZED = 9005;
}
