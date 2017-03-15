package cn.didadu.service;

import Ice.Communicator;
import Ice.Current;
import IceBox.Service;
import cn.didadu.generate.book.Message;
import cn.didadu.generate.book._OnlineBookDisp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangjing on 17-3-13.
 */
public class OnlineBookService extends _OnlineBookDisp implements Service{

    private Logger logger = LoggerFactory.getLogger(OnlineBookService.class);

    private Ice.ObjectAdapter _adapter;

    @Override
    public void start(String name, Communicator communicator, String[] args) {
        // 创建ObjectAdapter，这里和service同名
        _adapter = communicator.createObjectAdapter(name);
        // 创建servant，同样和service同名
        _adapter.add(this, communicator.stringToIdentity(name));
        // 激活servant
        _adapter.activate();
        logger.info("Service " + name + " started.");
    }

    @Override
    public void stop() {
        // 销毁ObjectAdapter
        _adapter.destroy();
        logger.info("Service " + _adapter.getName() + " stopped.");
    }

    @Override
    public Message bookTick(Message message, Current __current) {
        logger.info("call bookTick : " + message.toString());
        return message;
    }
}
