package receivers;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String type;
    private int speed;

    public CeilingFan(String type) {
        this.type = type;
        this.speed = OFF;
    }
    public void high(){
        this.speed = HIGH;
        System.out.println("Ceiling fan is working at " + this.speed + " speed");
    }
    public void medium(){
        this.speed = MEDIUM;
        System.out.println("Ceiling fan is working at " + this.speed + " speed");
    }
    public void low(){
        this.speed = LOW;
        System.out.println("Ceiling fan is working at " + this.speed + " speed");
    }
    public void off(){
        this.speed = OFF;
        System.out.println("Ceiling fan is not working at the moment of speech");
    }
    public int getSpeed(){
        return this.speed;
    }

}
