package cn.didadu;

import Ice.Application;
import cn.didadu.generate.helloworld.HelloPrx;
import cn.didadu.generate.helloworld.HelloPrxHelper;

/**
 * Created by zhangjing on 17-3-10.
 */
public class Client extends Application {

    // 自定义ShutdownHook
    class ShutdownHook extends Thread {
        @Override
        public void run() {
            communicator().destroy();
            System.out.println("destroy communicator");
        }
    }

    @Override
    public int run(String[] args) {
        // 注册ShutdownHook，关闭应用时销毁Communicator实例
        setInterruptHook(new ShutdownHook());
        // 通过config.client中的Hello.Proxy，构造通用Proxy对象
        Ice.ObjectPrx base = communicator().propertyToProxy("Hello.Proxy");
        HelloPrx prxy = HelloPrxHelper.checkedCast(base);
        prxy.sayHello(0);
        // shutdown()方法可以关闭服务...
        prxy.shutdown();
        // 测试ShutdownHook
        communicator().waitForShutdown();
        return 0;
    }

    public static void main(String[] args) {
        Client app = new Client();
        int status = app.main("Client", args, "config.client");
        System.exit(status);
    }
}
