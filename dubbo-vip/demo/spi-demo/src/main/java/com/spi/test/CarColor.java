package com.spi.test;


import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("benc")
public interface CarColor {
    @Adaptive("car")
    public String getColor(URL url);
}
