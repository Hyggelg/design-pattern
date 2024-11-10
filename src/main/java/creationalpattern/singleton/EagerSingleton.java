package creationalpattern.singleton;

/*饿汉式：类加载就会导致该单实例对象被创建
* 饿汉式的话对象直接被创建，如果对象很大，而一时半会又没被用上，
* 就会导致内存空间的浪费；懒汉的话不会导致内存空间的浪费，被用上了我才创建，
* 但实现一般都较为复杂。*/
class EagerSingleton {

    private static  EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
