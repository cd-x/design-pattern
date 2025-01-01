package org.example.command;

import org.example.command.objects.GarageDoor;

public class OpenGarageDoor implements ICommand{

    private GarageDoor door;
    public OpenGarageDoor(GarageDoor garageDoor) {
        door = garageDoor;
    }
    @Override
    public void execute() {
        door.setUp(true);
        door.setDown(false);
    }

    @Override
    public void undo() {
        door.setUp(false);
        door.setDown(true);
    }
}
