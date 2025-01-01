package org.example.command.objects;

public class GarageDoor {
    boolean up;
    boolean down;

    public void setUp(boolean up) {
        this.up = up;
        System.out.println(this);
    }

    public void setDown(boolean down) {
        this.down = down;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "GarageDoor{" +
                "up=" + up +
                ", down=" + down +
                '}';
    }
}
