package oo5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Interpreter {
    private Map<Character,Command> commandMap = new HashMap<>();
    private Rover rover;

    public void command(String commands){
        char[] chars = commands.toCharArray();
        for (char ch:chars){
            command(ch);
        }
    }

    public void command(char c){
        commandMap.get(c).execute(rover);
    }

    public void putCommand(char commandChar, Command command){
        commandMap.put(commandChar,command);
    }

    public Interpreter(Rover rover) {
        this.rover = rover;
        commandMap.put('M',(r)->r.move());
        commandMap.put('L',(r)->r.turnLeft());
        commandMap.put('R',(r)->r.turnRight());
    }
}
