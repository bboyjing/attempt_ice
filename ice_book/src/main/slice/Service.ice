[["java:package:cn.didadu.generate"]]
module book {
    struct Message {
        string name;
        int type;
        bool valid;
        double price;
        string content;
    };
    interface OnlineBook {
        Message bookTick(Message message);
    };
};