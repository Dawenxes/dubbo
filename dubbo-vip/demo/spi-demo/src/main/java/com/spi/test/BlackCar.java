package com.spi.test;


import org.apache.dubbo.common.URL;

/**
 * ClassName：  <br>
 * Description：  <br>
 * Copyright © 2020  Inc. All rights reserved. <br>
 * Company：<br>
 *
 * @author 张博能 <br>
 * date 2020/3/16 17:33 <br>
 * @version v1.0 <br>
 **/

public class BlackCar implements CarColor{



    @Override
    public String getColor(URL url) {
        return "black";
    }
}
