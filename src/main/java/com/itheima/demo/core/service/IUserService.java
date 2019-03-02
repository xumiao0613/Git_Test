package com.itheima.demo.core.service;

import com.itheima.demo.core.vo.UserVO;

import java.util.List;
import java.util.Map;

/**
 * @Author: Miao
 * @Date: 2019/3/2 15:03
 * @Desc:
 */
public interface IUserService {

    public Map<String,Object> queryUser();

    public int queryUserCount();

    public List<UserVO> queryUserList();
}
