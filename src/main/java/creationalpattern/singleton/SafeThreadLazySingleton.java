package creationalpattern.singleton;

/*线程安全*/
class SafeThreadLazySingleton {
    private static SafeThreadLazySingleton instance;

    private SafeThreadLazySingleton(){}

    public static SafeThreadLazySingleton getInstance() {
        synchronized (SafeThreadLazySingleton.class) {
            if (instance == null) {
                instance = new SafeThreadLazySingleton();
            }
        }
        return instance;
    }
}