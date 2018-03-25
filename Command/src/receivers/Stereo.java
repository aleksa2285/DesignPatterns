package receivers;

public class Stereo {
    private String type;
    private boolean isOn;
    private boolean isOff;
    private int volume;
    private boolean hasCd;

    public Stereo(String type) {
        this.isOn = false;
        this.isOff = false;
        this.volume = 0;
        this.hasCd = false;
        this.type = type;
    }
    public void setOn() {
        isOn = true;
        System.out.println("Stereo is " + isOn + " " + type);
    }
    public void setOff() {
        isOff = false;
        System.out.println("Stereo is " + isOff + " " + type);
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setCd() {
        this.hasCd = true;
    }
    public void unsetCd(){
        this.hasCd = false;
    }
}
