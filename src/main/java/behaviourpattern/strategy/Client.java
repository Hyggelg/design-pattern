package behaviourpattern.strategy;

public class Client {

    public static void main(String[] args) {
        //春节来了，使用春节促销活动
        SalesMan salesMan = new SalesMan(new StragetyA());
        //展示促销活动
        salesMan.salesManShow();

        salesMan.setStragety(new StragetyB());
        salesMan.salesManShow();

        salesMan.setStragety(new StragetyC());
        salesMan.salesManShow();
    }
}
