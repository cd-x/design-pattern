package org.example.command;

import org.example.command.objects.KitchenLight;

public class TurnKitchenLightOff implements ICommand{
    private KitchenLight kitchenLight;
    public TurnKitchenLightOff(KitchenLight light){
        this.kitchenLight = light;
    }
    @Override
    public void execute() {
        kitchenLight.setLightOn(false);
    }

    @Override
    public void undo() {
        kitchenLight.setLightOn(true);
    }
}
