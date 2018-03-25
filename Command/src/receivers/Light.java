package receivers;

public class Light {

    private String type;
    private boolean isOn;

    public Light(String type) {
        this.isOn = false;
        this.type = type;
    }
    public void on(){
        isOn = true;
        System.out.println("Lights are " + isOn + " " + type);
    };
    public void off(){
        isOn = false;
        System.out.println("Lights are " + isOn + " " + type);
    };

}
