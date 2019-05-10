package oo5;

@FunctionalInterface
public interface Command {
    public void execute(Rover rover);
}
