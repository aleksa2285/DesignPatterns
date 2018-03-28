package beverages;

import templates.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    public Tea() {
    }
    public void brew(){
        System.out.println("Steeping the tea");
    }
    public void addCondiments(){
        System.out.println("Adding lemon");
    }
}
