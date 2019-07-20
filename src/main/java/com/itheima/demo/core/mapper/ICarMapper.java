package com.itheima.demo.core.mapper;

import com.itheima.demo.core.vo.CarVO;
import com.itheima.demo.core.vo.PageVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Miao
 * @Date: 2019/3/17 23:38
 * @Desc:
 */
public interface ICarMapper {

    public List<CarVO> queryCar(@Param("car") CarVO car, @Param("pageVO")PageVO pageVO);

    public int queryCarCount(@Param("car") CarVO car);

    void addCar(@Param("car") CarVO car);

    void deleteCar(@Param("car") CarVO param);
}
