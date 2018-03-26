package subsystem;

public class Amplifier {
    public void on(){
        System.out.println("Turning on an amplifier");
    }
    public void setDvd(DVDPlayer dvdPlayer){
        System.out.println("Setting DVDPlayer, status: " + dvdPlayer);
    }
    public void setSurroundSound(){
        System.out.println("Sound system surround set up");
    }
    public void setVolume(){
        System.out.println("Setting up the volume");
    }
    public void off(){
        System.out.println("Shutting down the amplifier");
    }

}
