package com.ark.layer.framework.api.response;

import lombok.Data;

/**
 * API 调用返回的结果对象
 *
 */
@Data
public class Result<T> implements java.io.Serializable {

    /**
     * 0成功,永远默认成功
     */
    private String code = "200";

    /**
     * 业务错误码
     */
    private String businessCode = ResultCode.SUCCESS.getCode();

    /**
     * 消息
     **/
    private String msg;

    /**
     * 详细消息
     **/
    private String detail;

    /**
     * 数据
     **/
    private T data;

    private Boolean success;

    private String traceId;



    /**
     * @param resultCode 返回状态码
     */
    protected void setResultCode(ResultCode resultCode) {
        this.businessCode = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }

    public Result() {

    }


    public Result(String code, String businessCode, String msg, String detail, T data, boolean success) {
        this.code = code;
        this.businessCode = businessCode;
        this.msg = msg;
        this.detail = detail;
        this.data = data;
        this.success = success;
    }

    /**
     * 2022-01-06 将其他方法均规范为泛型，唯独剩余此方法
     * 剩余此方法原因：不清楚调用方是否通过对接口返回值的data字段判空来判断响应成功失败
     * 如果设置为泛型，setData中的值只能填写为null
     * 此时，如果调用存在下方行为，就会导致接口返回响应成功，但是调用方认为失败。
     * if ( response.getData == null ){
     *      接口响应失败
     * }
     * 虽然此种大概率不会发生，但是此方法使用的接口众多，难以让测试同事帮忙回归，因此留在此处不做修改
     * @return Result
     */
    public static Result success() {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData("");
        return result;
    }

    public static <T> Result<T> wrapError(String errCode, String errMsg) {
        Result result = new Result<T>();
        result.setMsg(errMsg);
        result.setSuccess(false);
        result.setCode(errCode);
        result.setBusinessCode(errCode);
        result.setDetail(errMsg);
        return result;
    }

    public static <T> Result<T> supplyChainSuccess() {
        Result<T> result = new Result<>();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setBusinessCode(ResultCode.SUCCESS.getCode());
        result.setSuccess(null);
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> failure() {
        Result<T> result = new Result<>();
        result.setResultCode(ResultCode.FAILURE);
        result.setCode(ResultCode.FAILURE.getCode());
        return result;
    }

    public static <T> Result<T> failure(String msg) {
        Result<T> result = new Result<>();
        result.setBusinessCode(ResultCode.FAILURE.getCode());
        result.setCode(ResultCode.FAILURE.getCode());
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> failure(ResultCode resultCode) {
        Result<T> result = new Result<>();
        result.setResultCode(resultCode);
        result.setCode(ResultCode.FAILURE.getCode());
        return result;
    }

    public static <T> Result<T> failure(ResultCode resultCode, String detail) {
        Result<T> result = new Result<>();
        result.setResultCode(resultCode);
        result.setCode(ResultCode.FAILURE.getCode());
        result.setDetail(detail);
        return result;
    }

    public boolean isSuccess() {
        return ("200".equals(code) || "0".equals(code)) && ResultCode.SUCCESS.getCode().equals(businessCode);
    }

}
