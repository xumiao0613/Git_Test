package com.itheima.demo.core.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Miao
 * @Date: 2019/3/26 20:36
 * @Desc:
 */
public class ResultUtils {

    public static final Map<String,Object> result = new HashMap<>();

    public static Map<String,Object> success(){
        result.put("success", "");
        return result;
    }

    public static Map<String,Object> error(String msg){
        result.put("error", msg);
        return result;
    }
}
