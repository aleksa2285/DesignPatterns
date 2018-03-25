package invoker;
import commands.Command;
import commands.NoCommand;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = new NoCommand();
    }
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot]= onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
        undoCommand = null;
    }
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------- Remote Control ---------\n");
        for (int i = 0; i<onCommands.length; i++){
            stringBuffer.append("[slot " +i +"] " + onCommands[i].getClass().getName() + "       " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("undo command" + undoCommand.getClass().getName());
        return  stringBuffer.toString();
    }

}
