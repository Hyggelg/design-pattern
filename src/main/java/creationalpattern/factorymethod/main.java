package creationalpattern.factorymethod;

/*定义一个用于创建对象的接口，让子类决定实例化哪个产品类对象。工厂方法使一个产品类的实例化延迟到其工厂的子类。*/
class main {
    public static void main(String[] args) {
        ACarFactory aCarFactory = new ACarFactory();
        Car car = aCarFactory.createCar();
        car.drive();

        BCarFactory bCarFactory = new BCarFactory();
        Car car1 = bCarFactory.createCar();
        car1.drive();
    }
}
