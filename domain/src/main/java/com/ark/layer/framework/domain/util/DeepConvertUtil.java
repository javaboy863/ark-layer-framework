package com.ark.layer.framework.domain.util;


import com.alibaba.fastjson.JSON;

public class DeepConvertUtil {
    public static <T> T deepCopy(Object source, Class<T> targetClass) {
        if (source == null) {
            return null;
        }
        String serialStr = JSON.toJSONString(source);
        T t = JSON.parseObject(serialStr, targetClass);
        return t;
    }
}
