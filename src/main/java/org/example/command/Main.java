package org.example.command;

import org.example.command.objects.GarageDoor;
import org.example.command.objects.KitchenLight;

public class Main {
    public static void main(String args[]){
        Remote remote = new Remote(2);
        GarageDoor garageDoor = new GarageDoor();
        KitchenLight kitchenLight = new KitchenLight();
        remote.configure(0,0,new OpenGarageDoor(garageDoor));
        remote.configure(0,1,new CloseGarageDoor(garageDoor));
        remote.configure(1,0,new TurnKitchenLightOn(kitchenLight));
        remote.configure(1,1,new TurnKitchenLightOff(kitchenLight));

        remote.pressButton(0,0);
        remote.pressButton(1,1);
        remote.undoAll();
    }
}
