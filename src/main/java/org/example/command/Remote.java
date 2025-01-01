package org.example.command;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Remote {
    private Stack<ICommand> commandList = new Stack<>();
    private List<List<ICommand>> buttons;
    public Remote(int slotCount){
        buttons = Stream.generate(() -> new ArrayList<ICommand>(Arrays.asList(null, null))).limit(slotCount).collect(Collectors.toUnmodifiableList());
        //buttons.stream().map(button -> Stream.generate(() -> new ArrayList()))
    }
    public void configure(int row, int col, ICommand command){
        buttons.get(row).set(col, command);
    }

    public void pressButton(int row, int col){
        ICommand command = buttons.get(row).get(col);
        command.execute();
        commandList.add(command);
    }
    public void undoAll(){
        while (!commandList.isEmpty()){
            ICommand command = commandList.pop();
            command.undo();
        }
    }
}
