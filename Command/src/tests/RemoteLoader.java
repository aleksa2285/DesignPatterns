package tests;

import commands.*;
import invoker.RemoteControl;
import receivers.CeilingFan;
import receivers.Light;
import receivers.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Stereo mainRoomStereo = new Stereo("Main room");
        CeilingFan ceilingFan = new CeilingFan("testing");


        LightOnCommand lightOnCommandLivingRoom = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommandLivingRoom = new LightOffCommand(livingRoomLight);
        StereoOnWithCdCommand mainRoomStereoOnCommandWithCd = new StereoOnWithCdCommand(mainRoomStereo);
        StereoOffCommand mainRoomStereoOffCommand = new StereoOffCommand(mainRoomStereo);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeillingFanLowCommand ceillingFanLowCommand = new CeillingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        //testing macro commands

        Command[] partyOn = {lightOnCommandLivingRoom, mainRoomStereoOnCommandWithCd};
        Command[] partyOff = {lightOffCommandLivingRoom, mainRoomStereoOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);


        remoteControl.setCommand(0, lightOnCommandLivingRoom, lightOffCommandLivingRoom);
        remoteControl.setCommand(1, mainRoomStereoOnCommandWithCd, mainRoomStereoOffCommand);
        remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, ceillingFanLowCommand, ceilingFanOffCommand);
        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();

            System.out.println(remoteControl);
            remoteControl.onButtonWasPushed(4);
            System.out.println(remoteControl);
            remoteControl.offButtonWasPushed(4);
            System.out.println(remoteControl);
    }
}
