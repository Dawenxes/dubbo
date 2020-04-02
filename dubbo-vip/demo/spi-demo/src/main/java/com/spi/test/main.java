package com.spi.test;


import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName：  <br>
 * Description：  <br>
 * Copyright © 2020  Inc. All rights reserved. <br>
 * Company：<br>
 *
 * @author 张博能 <br>
 * date 2020/3/16 15:23 <br>
 * @version v1.0 <br>
 **/
public class main {
    public static void main(String[] args) {
        ExtensionLoader<CarColor> extensionLoader = ExtensionLoader.getExtensionLoader(CarColor.class);
        Map<String, String> map = new HashMap<String, String>();
        map.put("car", "black");
        URL url = new URL("", "", 1, map);
        CarColor carColor1 = extensionLoader.getDefaultExtension();
        CarColor carColor = extensionLoader.getAdaptiveExtension();
        System.out.println(carColor1.getColor(url));
        System.out.println(carColor.getColor(url));
        System.out.println();

    }
}
