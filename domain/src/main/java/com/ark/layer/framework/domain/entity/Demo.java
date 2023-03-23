package com.ark.layer.framework.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * demo实体
 * </p>
 */
@Data
@TableName("demo")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Demo implements Serializable {

    private static final long serialVersionUID=1L;
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
