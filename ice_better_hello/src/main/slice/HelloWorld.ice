// 指定上层包名
[["java:package:cn.didadu.generate"]]
// module和Java的Package对应
module helloworld {
    interface Hello{
        idempotent void sayHello(int delay);
        void shutdown();
    };
};