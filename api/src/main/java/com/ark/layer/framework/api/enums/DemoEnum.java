package com.ark.layer.framework.api.enums;

/**
 * 展示状态枚举(demo)
 */
public enum DemoEnum {

    /**
     * 显示状态
     */
    SHOW(1, "显示"),
    /**
     * 隐藏状态
     */
    HIDE(2, "隐藏"),
    /**
     * 置灰状态
     */
    GRAYED(3, "置灰"),
    /**
     * 不可选择
     */
    UNAVAILABLE(4,"不可选");

    private int code;
    private String msg;

    DemoEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
