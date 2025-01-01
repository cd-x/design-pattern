package org.example.command;

import org.example.command.objects.GarageDoor;

public class CloseGarageDoor implements ICommand{
    private GarageDoor door;
    public CloseGarageDoor(GarageDoor garageDoor) {
        door = garageDoor;
    }
    @Override
    public void execute() {
        door.setUp(false);
        door.setDown(true);
    }

    @Override
    public void undo() {
        door.setUp(true);
        door.setDown(false);
    }
}
