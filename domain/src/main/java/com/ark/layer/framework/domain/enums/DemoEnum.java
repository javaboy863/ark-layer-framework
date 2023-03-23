package com.ark.layer.framework.domain.enums;

/**
 * @author chenst
 */
public enum DemoEnum {

    /**
     * 推荐标
     */
    RECOMMEND(1,"推荐标"),
    /**
     * 副标题
     */
    SUBTITLE(2,"副标题");

    /**
     * 类型
     */
    private int type;

    /**
     * 描述
     */
    private String desc;

    DemoEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
