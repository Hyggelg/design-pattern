package creationalpattern.singleton;

/*懒汉式-方式4（静态内部类方式）*/
class StaticInnerClass {
    private StaticInnerClass(){}

    private static class StaticInnerClassHolder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return StaticInnerClassHolder.INSTANCE;
    }
}
