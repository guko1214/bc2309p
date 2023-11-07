package poker2.game;
import poker2.model.Card;

public class Player {
    
    private static int lastId;

    private int id;
    private String name;
    private Card[] hand;
    
    private Player() {
        this.id = lastId++;
    }

    private Player(Card[] cards) {
        this.id = lastId++;
        this.hand = cards;
    }

    public Player(Card[] cards, String name) {
        this.id = lastId++;
        this.hand = cards;
        this.name = name;
    }

    public Player(String name) {
        this.id = lastId++;
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

    public static Player of() {
        return new Player();
    }

    public static Player of(Card[] cards) {
        return new Player(cards);
    }

    public static Player of(Card[] cards, String name) {
        return new Player(cards, name);
    }

    public static Player of(String name) {
        return new Player(name);
    }
}
