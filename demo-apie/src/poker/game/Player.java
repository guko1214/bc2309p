package game;
import model.Card;

public class Player {
    
    private static int lastId;

    private int id;
    private String name;
    private Card[] hand;
    
    public Player() {
        this.id = lastId++;
    }

    public Player(Card[] cards) {
        this.id = lastId++;
        this.hand = cards;
    }

    public Player(Card[] cards, String name) {
        this.id = lastId++;
        this.hand = cards;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCards(Card[] cards) {
        this.hand = cards;
    }

    public Card[] getCards() {
        return this.hand;
    }

}
