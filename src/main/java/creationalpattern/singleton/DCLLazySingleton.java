package creationalpattern.singleton;

//懒汉式-方式3（双重检查锁）
class DCLLazySingleton {
    private static volatile DCLLazySingleton instance;

    private DCLLazySingleton(){}

    public static DCLLazySingleton getInstance() {
        if (instance == null) {
            synchronized (DCLLazySingleton.class) {
                if (instance == null) {
                    instance = new DCLLazySingleton();
                }
            }
        }
        return instance;
    }
}