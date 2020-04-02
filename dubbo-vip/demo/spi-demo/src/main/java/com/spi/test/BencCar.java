package com.spi.test;


import org.apache.dubbo.common.URL;

/**
 * ClassName：  <br>
 * Description：  <br>
 * Copyright © 2020  Inc. All rights reserved. <br>
 * Company：<br>
 *
 * @author 张博能 <br>
 * date 2020/3/16 21:11 <br>
 * @version v1.0 <br>
 **/
public class BencCar implements CarColor {
    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    private CarColor carColor;

    @Override
    public String getColor(URL url) {
        System.out.println("奔驰车的颜色");
        return carColor.getColor(url);
    }

}
