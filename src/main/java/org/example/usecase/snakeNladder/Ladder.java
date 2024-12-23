package org.example.usecase.snakeNladder;

public class Ladder {
    private Integer jumpFrom;
    private Integer jumpTo;

    public Ladder(Integer jumpFrom, Integer jumpTo) {
        this.jumpFrom = jumpFrom;
        this.jumpTo = jumpTo;
    }

    public Integer getJumpFrom() {
        return jumpFrom;
    }

    public Integer getJumpTo() {
        return jumpTo;
    }
}
