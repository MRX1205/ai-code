package com.lyhm.lyhmaicode.common;

import com.lyhm.lyhmaicode.exception.ErrorCode;

public class ResultUtils {
    /**
     * 返回成功的方法
     * @param data 数据
     * @return 响应
     * @param <T>数据类型
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<T>(0,data,"ok");
    }

    /**
     * 失败时使用的方法
     * @param errorCode
     * @return
     */
    public static  BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败时使用的方法
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse<?> error(int code,String message) {
        return new BaseResponse<>(code,null,message);
    }

    public static BaseResponse<?> error(ErrorCode errorCode,String message) {
        return new BaseResponse<>(errorCode.getCode(),null,message);
    }
}
