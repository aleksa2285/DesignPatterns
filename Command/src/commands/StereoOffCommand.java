package commands;

import receivers.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        this.stereo.setOff();
    }
    @Override
    public void undo() {
        this.stereo.setOn();
    }
}
