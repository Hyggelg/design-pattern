package behaviourpattern.strategy;

public class SalesMan {

    public Stragety getStragety() {
        return stragety;
    }

    public void setStragety(Stragety stragety) {
        this.stragety = stragety;
    }

    //聚合策略类对象
    private Stragety stragety;

    public SalesMan(Stragety stragety){
        this.stragety = stragety;
    }

    //由促销员展示促销活动给用户
    public void salesManShow(){
        stragety.show();
    }
}
