package com.example.demo.adapter;

public class Slf4jTest {
    public static void main(String[] args) {
        Slf4jAPI slf4jAPI = (Slf4jAPI) new Slf4jAdapter(new Log4j());
        slf4jAPI.log("使用slf4j打印日志");
    }
}
