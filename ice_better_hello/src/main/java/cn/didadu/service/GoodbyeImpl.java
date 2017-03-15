package cn.didadu.service;

import Ice.Current;
import cn.didadu.generate.goodbye._ByeDisp;

/**
 * Created by zhangjing on 17-3-13.
 */
public class GoodbyeImpl extends _ByeDisp {

    @Override
    public void sayGoodbye(Current __current) {
        System.out.println("bye bye...");
    }

}
