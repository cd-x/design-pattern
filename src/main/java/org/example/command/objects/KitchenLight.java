package org.example.command.objects;

public class KitchenLight {
    private Boolean lightOn;

    public Boolean getLightOn() {
        return lightOn;
    }

    public void setLightOn(Boolean lightOn) {
        this.lightOn = lightOn;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "KitchenLight{" +
                "lightOn=" + lightOn +
                '}';
    }
}
