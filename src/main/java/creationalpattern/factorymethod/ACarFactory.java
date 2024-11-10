package creationalpattern.factorymethod;

public class ACarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new ACar();
    }
}
