package cn.didadu.service;

import Ice.Communicator;
import Ice.Current;
import Ice.Logger;
import IceBox.Service;
import cn.didadu.generate.book.Message;
import cn.didadu.generate.book.OnlineBookPrx;
import cn.didadu.generate.book.OnlineBookPrxHelper;
import cn.didadu.generate.sms._ISmsServiceDisp;

/**
 * Created by zhangjing on 17-3-15.
 */
public class SmsService extends _ISmsServiceDisp implements Service{
    private Logger logger;
    private Ice.ObjectAdapter _adapter;

    @Override
    public void start(String name, Communicator communicator, String[] args) {
        logger = communicator.getLogger().cloneWithPrefix(name);
        // 创建ObjectAdapter，这里和service同名
        _adapter = communicator.createObjectAdapter(name);
        // 创建servant，同样和service同名
        _adapter.add(this, communicator.stringToIdentity(name));
        // 激活servant
        _adapter.activate();
        logger.trace("SmsService", "started");
    }

    @Override
    public void stop() {
        logger.trace("SmsService", "stopped");
        _adapter.destroy();
    }

    @Override
    public void sendSms(String msg, Current __current) {
        // 注意，因为没有加载config.client，此处要用stringToProxy
        //Ice.ObjectPrx base = _adapter.getCommunicator().stringToProxy("OnlineBook:tcp -h localhost -p 10000");
        Ice.ObjectPrx base = _adapter.getCommunicator().stringToProxy("OnlineBook");
        OnlineBookPrx prxy = OnlineBookPrxHelper.checkedCast(base);
        Message message = new Message();
        message.name = "bboyjing";
        message.type = 1;
        message.price = 99.99;
        message.valid = true;
        message.content = "this is content";
        System.out.println("Tick book " + prxy.bookTick(message));
    }
}
