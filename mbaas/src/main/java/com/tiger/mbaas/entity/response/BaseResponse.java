package com.tiger.mbaas.entity.response;

/**
 * Created by tigershen on 2017/12/12.
 */

public class BaseResponse<T> {
    T serviceResponse;

    public T getServiceResponse() {
        return serviceResponse;
    }
}
