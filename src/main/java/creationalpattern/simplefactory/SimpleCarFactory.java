package creationalpattern.simplefactory;

//简单工厂
class SimpleCarFactory {
    public static Car getCar(String carType){
        switch (carType){
            case "A": return new ACar();
            case "B": return new BCar();
            default: return null;
        }
    }
}
