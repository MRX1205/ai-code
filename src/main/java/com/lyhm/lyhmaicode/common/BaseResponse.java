package com.lyhm.lyhmaicode.common;

import com.lyhm.lyhmaicode.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;
@Data
public class BaseResponse<T> implements Serializable {
    /**
     * 错误码
     */
    private int code;
    /**
     * 数据
     */
    private  T data;
    /**
     * 信息
     */
    private String message;

    public BaseResponse(int code,T data,String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    /**
     * 传入码 和 数据
     * @param code
     * @param data
     */
     public BaseResponse(int code,T data) {
        this.code = code;
        this.data = data;
     }

    /**
     * 传入错误码
     * @param errorCode
     */
     public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(),null,errorCode.getMessage());
     }
}
