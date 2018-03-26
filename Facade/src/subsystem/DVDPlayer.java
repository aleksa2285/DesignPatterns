package subsystem;

public class DVDPlayer {
    public void on(){
        System.out.println("Turning on DVD Player");
    }
    public void play(String movie){
        System.out.println("Starting to play " + movie + " movie");
    }
    public void stop(){
        System.out.println("Stopping the movie");
    }
    public void eject(){
        System.out.println("Ejecting cd...");
    }
    public void off(){
        System.out.println("Shutting down DVDPlayer");
    }

}
