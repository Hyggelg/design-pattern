package creationalpattern.abstractfactory;

/*定义了一个接口用于创建相关或有依赖关系的对象族，而无需明确指定具体类。*/
public class main {
    public static void main(String[] args) {
        AFactory aFactory = new AFactory();
        BFactory bFactory = new BFactory();

        Car car = aFactory.createCar();
        Bike bike = aFactory.createBike();
        car.drive();
        bike.ride();

        Car car1 = bFactory.createCar();
        Bike bike1 = bFactory.createBike();
        car1.drive();
        bike1.ride();
    }
}
