package creationalpattern.simplefactory;

/*定义了一个创建对象的类，由这个类来封装实例化对象的行为。*/
public class main {
    public static void main(String[] args) {
        Car car1 = SimpleCarFactory.getCar("A");
        car1.drive();

        Car car2 = SimpleCarFactory.getCar("B");
        car2.drive();
    }
}
