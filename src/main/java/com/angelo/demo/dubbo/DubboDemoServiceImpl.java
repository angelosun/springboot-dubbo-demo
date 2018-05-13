package com.angelo.demo.dubbo;

import org.springframework.stereotype.Service;


@Service
public class DubboDemoServiceImpl implements DubboDemoService {

    public String sayHello(String s) {
        String test = "调用失败";
/*        try {
            test = testService.testService(s);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return "provide服务提供方0:你好，"+s+"! \t\t " + test;
    }
}