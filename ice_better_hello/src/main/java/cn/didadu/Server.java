package cn.didadu;

import Ice.Application;
import Ice.ObjectAdapter;
import cn.didadu.service.HelloImpl;

/**
 * Created by zhangjing on 17-3-10.
 */
public class Server extends Application{
    @Override
    public int run(String[] args) {
        // 通过config.server配置文件初始化服务站点
        ObjectAdapter adapter = communicator().createObjectAdapter("Hello");
        adapter.add(new HelloImpl(), Ice.Util.stringToIdentity("hello"));
        adapter.activate();
        System.out.println("server start...");
        communicator().waitForShutdown();
        return 0;
    }

    public static void main(String[] args) {
        Server app = new Server();
        int status = app.main("Server", args, "config.server");
        System.exit(status);
    }
}
