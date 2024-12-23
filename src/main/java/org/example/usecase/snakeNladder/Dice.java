package org.example.usecase.snakeNladder;

public class Dice {
    Integer range;
    public Dice(Integer size){
        range = size;
    }
    Integer throwDice(){
        Integer randomValue = java.util.random.RandomGenerator.getDefault().nextInt();
        return (randomValue % range) +1;
    }
}
