package com.ark.layer.framework.api.request;

import java.io.Serializable;
import lombok.Data;

@Data
public class DemoRequest implements Serializable {
    private static final long serialVersionUID = -6341850070740912902L;
    private Long id;

    /**
     * 平台ID
     */
    private Long pfid;
}
