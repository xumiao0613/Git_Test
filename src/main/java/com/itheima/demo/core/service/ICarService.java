package com.itheima.demo.core.service;

import com.itheima.demo.core.vo.CarVO;
import com.itheima.demo.core.vo.PageResult;
import com.itheima.demo.core.vo.PageVO;

import java.util.Map;

/**
 * @Author: Miao
 * @Date: 2019/3/17 23:35
 * @Desc:
 */
public interface ICarService {

    public PageResult<CarVO> queryCar(CarVO car, PageVO pageVO);

    void addCar(CarVO car);

    Map<String, Object> deleteCar(CarVO param);
}
