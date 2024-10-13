package com.Vivek;

import java.util.*;

public class PlaySnakeAndLadder {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static int NUMBER_OF_DICE;
    private static final Queue<Player> allPlayers = new LinkedList<>();
    private static final List<Jumper> SNAKES = new ArrayList<>();
    private static final List<Jumper> LADDERS = new ArrayList<>();
    private static final Map<String, Integer> PLAYER_CURRENT_POSITION = new HashMap<>();

    private static int diceInput(Scanner scanner){
        System.out.println("How many dice you wanna have ?");
        return scanner.nextInt();
    }

    private static void playerInput(Scanner scanner){
        System.out.println("How many players ?");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= n; i++){
            System.out.print(i + " Name of the player: ");
            String name = scanner.nextLine();
            Player player = new Player(i, name);
            allPlayers.offer(player);
        }
        System.out.println();
    }

    private static void setSnakes(Scanner scanner){
        System.out.println("How many snakes ?");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i + " Snake head position ?");
            int head = scanner.nextInt();
            System.out.print(i + " Snake tail position ? (must be lesser than the head position) " + head + ": ");
            int tail = scanner.nextInt();
            if(head > tail){
                Jumper snake = new Jumper(head, tail);
                SNAKES.add(snake);
            }else{
                System.out.println("Error: You gave tail > head for snake");
            }
        }
        System.out.println();
    }

    private static void setLadder(Scanner scanner){
        System.out.println("How many ladders ?");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(i + " leader top position ?");
            int top = scanner.nextInt();
            System.out.print(i + " ladder bottom position ? (must be greater than the top position) " + top + ": ");
            int bottom = scanner.nextInt();
            if(bottom > top){
                Jumper ladder = new Jumper(top, bottom);
                LADDERS.add(ladder);
            }else{
                System.out.println("Error: You gave bottom > top for ladder");
            }
        }
        System.out.println();
    }

    private static void gettingStarted(){
        for(Player player : allPlayers){
            PLAYER_CURRENT_POSITION.put(player.getPlayerName(), 0);
        }
    }

    public static void main(String[] args) {
        NUMBER_OF_DICE = diceInput(SCANNER);
        Dice dice = new Dice(NUMBER_OF_DICE);
        playerInput(SCANNER);
        setSnakes(SCANNER);
        setLadder(SCANNER);
        gettingStarted();
        System.out.print("Enter board size: ");
        int boardSize = SCANNER.nextInt();
        GameBoard gameBoard = new GameBoard(
                dice, allPlayers, SNAKES, LADDERS, PLAYER_CURRENT_POSITION, boardSize
        );
        gameBoard.startGame();
    }
}