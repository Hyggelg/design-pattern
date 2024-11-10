package creationalpattern.factorymethod;

public class BCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new BCar();
    }
}
