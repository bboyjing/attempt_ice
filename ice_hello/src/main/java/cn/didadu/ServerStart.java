package cn.didadu;

import cn.didadu.service.HelloWorldServiceImpl;

/**
 * Created by zhangjing on 17-3-9.
 */
public class ServerStart {
    public static void main(String[] args) {
        Ice.Communicator ic = null;
        try {
            // 初始化Communicator，该组件负责处理网络通信，实现RPC调用
            ic = Ice.Util.initialize();
            // 创建提供服务的站点，缺省协议为TCP/IP，端口为10000
            Ice.ObjectAdapter adapter = ic.
                    createObjectAdapterWithEndpoints("MyServiceAdapter", "default -p 10000");
            // 创建具体提供服务的实例
            HelloWorldServiceImpl servant = new HelloWorldServiceImpl();
            // 将服务实例添加到提供服务的站点
            adapter.add(servant, Ice.Util.stringToIdentity("HelloService"));
            // 激活服务站点
            adapter.activate();
            System.out.println("server started");
            ic.waitForShutdown();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ic != null) {
                ic.destroy();
            }
        }
    }
}
