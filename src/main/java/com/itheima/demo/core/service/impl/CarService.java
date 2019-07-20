package com.itheima.demo.core.service.impl;

import com.alibaba.fastjson.JSON;
import com.itheima.demo.core.contoller.CarController;
import com.itheima.demo.core.mapper.ICarMapper;
import com.itheima.demo.core.service.ICarService;
import com.itheima.demo.core.utils.ResultUtils;
import com.itheima.demo.core.vo.CarVO;
import com.itheima.demo.core.vo.PageResult;
import com.itheima.demo.core.vo.PageVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Miao
 * @Date: 2019/3/17 23:36
 * @Desc:
 */
@Service
public class CarService implements ICarService {

    private static final Logger LOG = LoggerFactory.getLogger(CarController.class);

    @Autowired
    private ICarMapper iCarMapper;

    @Override
    public PageResult<CarVO> queryCar(CarVO car, PageVO pageVO) {
        List<CarVO> carList = new ArrayList<>();
        carList = iCarMapper.queryCar(car, pageVO);
        int totalRows = iCarMapper.queryCarCount(car);
        PageResult<CarVO> pageResult = new PageResult<>();
        pageVO.setTotalRows(totalRows);
        pageResult.setPageVO(pageVO);
        pageResult.setRecord(carList);
        return pageResult;
    }

    @Override
    public void addCar(CarVO car) {
        iCarMapper.addCar(car);
    }

    @Override
    public Map<String, Object> deleteCar(CarVO param) {
        LOG.info("deleteCar param: " + JSON.toJSONString(param));
        iCarMapper.deleteCar(param);
        return ResultUtils.success();
    }
}
