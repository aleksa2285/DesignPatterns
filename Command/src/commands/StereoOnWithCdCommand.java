package commands;

import receivers.Stereo;

public class StereoOnWithCdCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.setOn();
        stereo.setCd();
        stereo.setVolume(11);
    }
    @Override
    public void undo() {
        stereo.unsetCd();
        stereo.setOff();
    }
}
