package commands;

import receivers.CeilingFan;

public class CeilingFanMediumCommand implements Command {

    private CeilingFan ceelingFan;
    private int previousSpeed;

    public CeilingFanMediumCommand(CeilingFan ceelingFan) {
        this.ceelingFan = ceelingFan;
    }
    @Override
    public void execute() {
        this.previousSpeed = this.ceelingFan.getSpeed();
        this.ceelingFan.medium();
    }
    @Override
    public void undo() {
        if (previousSpeed == ceelingFan.HIGH)
            ceelingFan.high();
        else if(previousSpeed == CeilingFan.MEDIUM)
            ceelingFan.medium();
        else if (previousSpeed == CeilingFan.LOW)
            ceelingFan.low();
        else if (previousSpeed == CeilingFan.OFF)
            ceelingFan.off();
    }
}
