package com.ark.layer.framework.api.response;


/**
 * API调用结果状态码定义
 *
 */
public enum ResultCode {
    /**
     * 响应[消息中心]专用
     */

    SUCCESS("200", "成功"),
    FAILURE("0001", "失败"),

    //40x: 参数数据异常
    PARAM_ERROR("4000", "参数错误"),
    SYSTEM_ERROR("5000", "系统错误"),
    ;


    private String code;

    private String msg;


    private ResultCode(String code, String msg) {

        this.code = code;
        this.msg = msg;
    }


    public String getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
