package org.example.usecase.snakeNladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        List<Snake> snakes = List.of(new Snake(99, 3), new Snake(21, 10), new Snake(43, 12), new Snake(17,7), new Snake(65, 12));
        List<Ladder> ladders = List.of(new Ladder(4, 33), new Ladder(15, 55), new Ladder(37, 98), new Ladder(23, 56));
        Board board = new Board(10, 10);
        Dice dice  =new Dice(6);
        board.assignLadders(ladders);
        board.assignSnakes(snakes);
        System.out.println("Enter number of players: ");
        Scanner sc = new Scanner(System.in);
        Integer players = sc.nextInt();
        List<Player> playerList = new ArrayList<>();
        for(int i=0;i<players;i++){
            Player p = new Player(i);
            System.out.println("Enter player name: ");
            String name = sc.next();
            p.setId(name.charAt(0));
            playerList.add(p);
        }
        board.assignPlayers(playerList);
        Boolean hasWinner = false;
        Integer turn = 0;
        while(!hasWinner){
            Player cur = playerList.get(turn);
            board.updatePlayer(cur, dice.throwDice());
            board.printBoard();
            if(board.isWinner(cur))
                break;
            turn = (turn +1)%players;
        }
        System.out.println(playerList);
    }
}
