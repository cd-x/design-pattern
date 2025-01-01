package org.example.command;

import org.example.command.objects.KitchenLight;

public class TurnKitchenLightOn implements ICommand{
    private KitchenLight kitchenLight;
    public TurnKitchenLightOn(KitchenLight light){
        this.kitchenLight = light;
    }
    @Override
    public void execute() {
        kitchenLight.setLightOn(true);
    }

    @Override
    public void undo() {
        kitchenLight.setLightOn(false);
    }
}
