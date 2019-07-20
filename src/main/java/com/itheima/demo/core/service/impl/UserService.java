package com.itheima.demo.core.service.impl;

import com.itheima.demo.core.mapper.IUserMapper;
import com.itheima.demo.core.service.IUserService;
import com.itheima.demo.core.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Miao
 * @Date: 2019/3/2 15:04
 * @Desc:
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserMapper iUserMapper;

    @Override
    public Map<String, Object> queryUser() {
        return iUserMapper.queryUser();
    }

    @Override
    public int queryUserCount() {
        return iUserMapper.queryUserCount();
    }

    @Override
    public List<UserVO> queryUserList() {
        return iUserMapper.queryUserList();
    }
}
