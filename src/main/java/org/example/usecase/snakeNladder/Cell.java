package org.example.usecase.snakeNladder;

public class Cell {
    private Integer index;
    private String value;
    public Cell(Integer index){
        this.index = index;
        value = index.toString();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
