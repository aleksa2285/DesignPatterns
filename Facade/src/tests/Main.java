package tests;

import facade.HomeTheaterFacade;
import subsystem.*;

public class Main {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, projector, theaterLights, screen, popcornPopper);

        homeTheaterFacade.watchMovie("Raiders on the storm");
        homeTheaterFacade.endMovie();
    }
}
