package commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("sta god");
    }

    @Override
    public void undo() {

    }
}
