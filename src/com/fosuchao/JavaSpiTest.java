package com.fosuchao;

import java.util.ServiceLoader;

/**
 * Created by Chao Ye on 2020/11/5
 */

public class JavaSpiTest {

    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        serviceLoader.forEach(Robot::sayHello);
    }
}
