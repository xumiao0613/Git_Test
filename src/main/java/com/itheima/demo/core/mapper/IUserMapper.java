package com.itheima.demo.core.mapper;

import com.itheima.demo.core.vo.UserVO;

import java.util.List;
import java.util.Map;

/**
 * @Author: Miao
 * @Date: 2019/2/27 23:03
 * @Desc:
 */
public interface IUserMapper {

    public Map<String,Object> queryUser();

    public int queryUserCount();

    public List<UserVO> queryUserList();

}
