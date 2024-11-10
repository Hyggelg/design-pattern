package creationalpattern.singleton;

/*懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建*/
class UnsafeThreadLazySingleton {

    private static UnsafeThreadLazySingleton instance;

    private UnsafeThreadLazySingleton(){}

    public static UnsafeThreadLazySingleton getInstance(){
        if (instance == null){
             instance = new UnsafeThreadLazySingleton();
        }
        return instance;
    }
}
