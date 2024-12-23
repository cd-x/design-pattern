package org.example.usecase.snakeNladder;

public class Snake {
    private Integer biteAt;
    private Integer leaveAt;
    public Snake(Integer biteAt, Integer leaveAt){
        this.biteAt = biteAt;
        this.leaveAt = leaveAt;
    }

    public Integer getBiteAt() {
        return biteAt;
    }

    public Integer getLeaveAt() {
        return leaveAt;
    }
}
