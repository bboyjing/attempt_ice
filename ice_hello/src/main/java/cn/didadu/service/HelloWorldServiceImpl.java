package cn.didadu.service;

import Ice.Current;
import cn.didadu.generate.helloworld._HelloWorldServiceDisp;

/**
 * Created by zhangjing on 17-3-9.
 */
public class HelloWorldServiceImpl extends _HelloWorldServiceDisp {
    @Override
    public String hello(Current __current) {
        return "Hello World!";
    }
}
