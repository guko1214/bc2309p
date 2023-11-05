package game;

import java.util.Random;

public class Onetwo extends Game {
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        System.out.println(playerOne.getId());
        Player playerTwo = new Player();
        System.out.println(playerTwo.getId());

        Onetwo oneTwo = new Onetwo();
        System.out.println(oneTwo.maxNumPlayer);


    }

}
