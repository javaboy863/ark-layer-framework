package com.ark.layer.framework.api.response;


import java.io.Serializable;
import lombok.Data;

@Data
public class DemoResponse implements Serializable {
    private static final long serialVersionUID = 3688612454622799682L;


    private Long id;

    /**
     * demo名称
     */
    private String demoName;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 修改人
     */
    private String modifier;
}
