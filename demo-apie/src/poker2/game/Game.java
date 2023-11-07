package poker2.game;

import poker2.model.Card;
import poker2.model.Deck;

public abstract class Game {
    
    static int deckPerGame;
    static int minNumPlayer;
    static int maxNumPlayer;
    private Player[] players;
    private Deck deck;
    private Card[] cardTricks; // card given out to tricks by player

    public Game(Deck deck, Player[] players) {
        this.deck = deck;
        this.players = players;
    }

    
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Player[] getPlayers() {
        return this.players;
    }

    public Deck getDeck() {
        return this.deck;
    }


}
