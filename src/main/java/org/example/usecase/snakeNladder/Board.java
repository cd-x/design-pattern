package org.example.usecase.snakeNladder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private Integer rowSize;
    private Integer colSize;
    private List<Cell> cells;
    private Map<Integer, Integer> snakeMap;
    private Map<Integer, Integer> ladderMap;
    private Map<Integer, Player> playerMap;
    public Board(Integer rowSize, Integer colSize){
        this.rowSize = rowSize;
        this.colSize = colSize;
        snakeMap = new HashMap<>();
        ladderMap = new HashMap<>();
        playerMap = new HashMap<>();
        cells = new ArrayList<>(rowSize*colSize+1);
        for(int idx = 1;idx<=rowSize*colSize;idx++){
            cells.add(new Cell(idx));
        }
    }

    public void assignLadders(List<Ladder> ladders){
        for(Ladder ladder: ladders){
            ladderMap.put(ladder.getJumpFrom(), ladder.getJumpTo());
        }
    }

    public void assignSnakes(List<Snake> snakes){
        for(Snake snake: snakes){
            snakeMap.put(snake.getBiteAt(), snake.getLeaveAt());
        }
    }
    public void assignPlayers(List<Player> players){
        for (Player player: players){
            playerMap.put(player.getIndex(), player);
        }
    }

    public void printBoard(){

    }

    public void updatePlayer(Player player, Integer throwVal){

    }

    public Boolean isWinner(Player player){
        return false;
    }

}
