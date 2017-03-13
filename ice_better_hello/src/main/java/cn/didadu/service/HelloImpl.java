package cn.didadu.service;

import Ice.Current;
import cn.didadu.generate.helloworld._HelloDisp;

/**
 * Created by zhangjing on 17-3-10.
 */
public class HelloImpl extends _HelloDisp {
    @Override
    public void sayHello(int delay, Current __current) {
        if (delay > 0) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hello World!");
    }

    @Override
    public void shutdown(Current __current) {
        System.out.println("Server Shutting down...");
        // 关闭服务
        __current.adapter.getCommunicator().shutdown();
    }
}
