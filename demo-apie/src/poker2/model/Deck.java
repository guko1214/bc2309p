package poker2.model;

import java.util.Random;

public class Deck {
  
  private Card[] cards;
  //private boolean withJoker;

  private Deck(boolean withJoker) {
    int size = withJoker ? 54 : 52;
    cards = new Card[size];
    // int suitNum = 0;
    // int rankNum = 0;
    // for (int i = 0; i < this.cardArr.length; i++) {
    //   this.cardArr[i] = Card.of(Suit.values()[suitNum], Rank.values()[rankNum]);
    //   if (suitNum == 3)
    //     suitNum = 0;
    //   if (rankNum == 12)
    //     rankNum = 0;
    // }
    int i = 0;
    for (Rank rank : Rank.values()) {
      for (Suit suit : Suit.values()) {
        if (rank != Rank.JOKER_1 && rank != Rank.JOKER_2) {
        //if (i < 52) { 
          cards[i++] = Card.of(rank, suit);
        }
      }
    }
    if (withJoker) {
      cards[i++] = Card.of(Rank.JOKER_1, null);
      cards[i++] = Card.of(Rank.JOKER_2, null);
    }
  }

  public Card getCardByIndex(int idx) {
    return this.cards[idx];
  }

  public Card Deal() {
    Card card;
    for (int i = this.cards.length - 1; i > -1; i--)
      if (this.cards[i] != null) {
        card = cards[i];
        this.cards[i] = null;
        return card;
      }
    return null;
  }

  public void cut() {
    int pos = new Random().nextInt(this.cards.length);
    System.out.println(pos);
    Card[] tempCards = new Card[pos];
    int cardLength = this.cards.length;
    for (int i = 0; i < pos; i++) {
      tempCards[i] = this.cards[i];
    }
    for (int i = 0; i < cardLength - pos; i++) {
      this.cards[i] = this.cards[pos + i];
    }
    for (int i = 0; i < pos; i++) {
      this.cards[cardLength - pos + i] = tempCards[i];
    }
  }

  public void shuffle() {
    Random random = new Random();
    Card[] newCards = new Card[this.cards.length];
    int filled = 0;
    int idx = 0;
    while (filled < this.cards.length) {
      int pos =  random.nextInt(this.cards.length);
      if (newCards[pos] == null) {
        newCards[pos] = this.cards[idx++];
        filled++;
      }
    }
    this.cards = newCards;
  }
  

  public static void main(String[] args) {
    
    Deck deck = Deck.withJoker();
    System.out.println(deck.getCardByIndex(0).getSuit());
    System.out.println(deck.getCardByIndex(0).getRank());
    for (int i = 0; i < 54; i++) {
      System.out.println(deck.getCardByIndex(i).getSuit() + " " + deck.getCardByIndex(i).getRank());
    }
    deck.shuffle();
    //deck.cut();
    System.out.println("====");
    for (int i = 0; i < 54; i++) {
      System.out.println(deck.getCardByIndex(i).getSuit() + " " + deck.getCardByIndex(i).getRank());
    }
    

  }

  private static Deck of(boolean withJoker) {
    return new Deck(withJoker);
  }

  public static Deck withJoker() {
    return Deck.of(true);
  }

  public static Deck withoutJoker() {
    return Deck.of(false);
  }

}
