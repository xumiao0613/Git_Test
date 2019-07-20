package com.itheima.demo.core.vo;

/**
 * @Author: Miao
 * @Date: 2019/3/17 23:30
 * @Desc:
 */
public class CarVO extends BaseVO{

    private Long carId;
    private String carName;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
