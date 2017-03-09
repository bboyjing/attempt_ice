package cn.didadu;

import cn.didadu.generate.helloworld.HelloWorldServicePrx;
import cn.didadu.generate.helloworld.HelloWorldServicePrxHelper;

/**
 * Created by zhangjing on 17-3-9.
 */
public class Client {
    public static void main(String[] args) {
        Ice.Communicator ic = null;
        try {
            // 初始化网络通信组件
            ic = Ice.Util.initialize();
            // 通过名称、协议、端口，构造通用Proxy对象
            Ice.ObjectPrx base = ic.stringToProxy("HelloService:default -p 10000");
            // 将通用Proxy对象转为真实的服务(uncheckedCast(base)可以减少一次远程调用)
            HelloWorldServicePrx prxy = HelloWorldServicePrxHelper.checkedCast(base);
            if (prxy == null) {
                throw new Error("Invalid proxy");
            }
            // 调用服务
            System.out.println(prxy.hello());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ic != null) {
                ic.destroy();
            }
        }
    }
}
