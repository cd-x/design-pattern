package org.example.usecase.snakeNladder;

public class Player {
    private Integer index;
    private Character id;
    private Integer position;
    public Player(Integer id){
        this.index = id;
        this.id = (char) (65 + id);
        position = 0;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Character getId() {
        return id;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setId(Character id) {
        this.id = id;
    }
}
