package com.itheima.demo.core.contoller;

import com.alibaba.fastjson.JSON;
import com.itheima.demo.core.service.ICarService;
import com.itheima.demo.core.utils.ResultUtils;
import com.itheima.demo.core.vo.CarVO;
import com.itheima.demo.core.vo.PageResult;
import com.itheima.demo.core.vo.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Miao
 * @Date: 2019/3/17 23:30
 * @Desc:
 */
@RestController
@RequestMapping("local/car")
@Api(value = "车Controller", tags = {"CarController"})
public class CarController {

    private static final Logger LOG = LoggerFactory.getLogger(CarController.class);

    @Autowired
    private ICarService iCarService;

    @PostMapping("/queryCar/{curPage}/{pageSize}")
    @ApiOperation(value = "查询车", notes = "查询车")
    public PageResult<CarVO> queryCar(@RequestBody CarVO car, PageVO pageVO){
        LOG.info("queryCar param : " + JSON.toJSONString(car));
        return iCarService.queryCar(car, pageVO);
    }

    @PostMapping("/addCar")
    @ApiOperation(value = "新增车", notes = "新增车")
    public Map<String,Object> addCar(@RequestBody CarVO car){
        LOG.info("addCar param : " + JSON.toJSONString(car));
        if(StringUtils.isEmpty(car) || StringUtils.isEmpty(car.getCarId())){
            return ResultUtils.error("ID is must");
        }
        iCarService.addCar(car);
        return ResultUtils.success();
    }

    @PostMapping("/deleteCar")
    @ApiOperation(value = "删除车", notes = "删除车")
    public Map<String, Object> deleteCar(@RequestBody CarVO param) {
        return iCarService.deleteCar(param);
    }
}
