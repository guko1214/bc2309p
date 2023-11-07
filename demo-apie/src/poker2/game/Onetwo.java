package poker2.game;

import java.util.Random;
import poker2.model.Deck;
import poker2.model.Card;

public class Onetwo extends Game {

    static int deckPerGame = 1;
    static int minNumPlayer = 2;
    static int maxNumPlayer = 4;
    
    public Onetwo(Deck deck, Player[] players) {
        super(deck, players);
    }


    public static void main(String[] args) {

        Deck deck = Deck.withJoker();

        ///Player playerOne = new Player();
        Player playerOne = Player.of();
        System.out.println(playerOne.getId());
        // Player playerTwo = new Player();
        Player playerTwo = Player.of();
        System.out.println(playerTwo.getId());

        Player[] players = new Player[] {playerOne, playerTwo, Player.of("John"), Player.of("Mary")};
        Onetwo oneTwo = new Onetwo(deck, players);
        System.out.println(Onetwo.maxNumPlayer);
        System.out.println(oneTwo.getDeck().getCardByIndex(0).getRank());
        System.out.println(oneTwo.getDeck().getCardByIndex(0).getSuit());
        oneTwo.getDeck().shuffle();
        System.out.println(oneTwo.getDeck().getCardByIndex(0).getRank());
        System.out.println(oneTwo.getDeck().getCardByIndex(0).getSuit());

        Card[] dealCards = new Card[] {oneTwo.getDeck().Deal()};
        oneTwo.getPlayers()[0].setCards(dealCards);
        System.out.println(oneTwo.getPlayers()[0].getCards()[0]);//.getRank());
        dealCards = new Card[] {oneTwo.getDeck().Deal()};
        oneTwo.getPlayers()[0].setCards(dealCards);
        System.out.println(oneTwo.getPlayers()[0].getCards()[0]);//.getRank());
    }

}
