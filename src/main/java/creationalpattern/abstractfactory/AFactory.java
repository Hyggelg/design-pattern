package creationalpattern.abstractfactory;

class AFactory implements Factory{
    @Override
    public Car createCar() {
        return new ACar();
    }

    @Override
    public Bike createBike() {
        return new ABike();
    }
}

class BFactory implements Factory{
    @Override
    public Car createCar() {
        return new BCar();
    }

    @Override
    public Bike createBike() {
        return new BBike();
    }
}
