package com.itheima.demo.core.contoller;

import com.alibaba.fastjson.JSON;
import com.itheima.demo.core.service.IUserService;
import com.itheima.demo.core.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: Miao
 * @Date: 2019/3/2 14:59
 * @Desc:
 */
@RestController
@RequestMapping("local/user")
@Api(value = "用户Controller", tags = {"UserController"})
//@CrossOrigin
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @GetMapping("/queryUser")
    @ApiOperation(value = "查询用户", notes = "查询用户")
    public Map<String,Object> queryUser(){
        Map<String, Object> result = userService.queryUser();
        LOG.info("result: " + JSON.toJSONString(result));
        return result;
    }

    @GetMapping("/queryUserCount")
    @ApiOperation(value = "查询用户数目", notes = "查询用户数目")
    public int queryUserCount(){
        return userService.queryUserCount();
    }

    @GetMapping("/queryUserList")
    @ApiOperation(value = "查询用户List", notes = "查询用户List")
    public List<UserVO> queryUserList(){
        return userService.queryUserList();
    }


}
