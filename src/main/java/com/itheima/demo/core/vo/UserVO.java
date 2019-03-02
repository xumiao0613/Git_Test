package com.itheima.demo.core.vo;

/**
 * @Author: Miao
 * @Date: 2019/3/2 15:01
 * @Desc: user信息实体类
 */
public class UserVO {

    private Long userId;
    private String userCode;
    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
