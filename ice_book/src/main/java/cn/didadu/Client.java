package cn.didadu;

import Ice.Application;
import cn.didadu.generate.book.Message;
import cn.didadu.generate.book.OnlineBookPrx;
import cn.didadu.generate.book.OnlineBookPrxHelper;
import cn.didadu.generate.sms.ISmsServicePrx;
import cn.didadu.generate.sms.ISmsServicePrxHelper;

/**
 * Created by zhangjing on 17-3-15.
 */
public class Client extends Application {
    public static void main(String[] args) {
        Client app = new Client();
        int status = app.main("Client", args, "config.client");
        System.exit(status);
    }

    @Override
    public int run(String[] args) {
        //tickBook();
        sendSms();
        return 0;
    }

    private void tickBook() {
        Ice.ObjectPrx base = communicator().propertyToProxy("OnlineBook.Proxy");
        OnlineBookPrx prxy = OnlineBookPrxHelper.checkedCast(base);
        Message message = new Message();
        message.name = "bboyjing";
        message.type = 1;
        message.price = 99.99;
        message.valid = true;
        message.content = "this is content";
        System.out.println(prxy.bookTick(message));
    }

    private void sendSms() {
        // 通过config.client中的Hello.Proxy，构造通用Proxy对象
        Ice.ObjectPrx base = communicator().propertyToProxy("SmsService.Proxy");
        ISmsServicePrx prxy = ISmsServicePrxHelper.checkedCast(base);
        prxy.sendSms("Hello.");
    }
}
