package poker;

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
        if (rank != Rank.JOKER_1 || rank != Rank.JOKER_2) {
          cards[i++] = Card.of(suit, rank);
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

  public static void main(String[] args) {
    
    Deck deck = Deck.withJoker();
    System.out.println(deck.getCardByIndex(0).getSuit());
    System.out.println(deck.getCardByIndex(0).getRank());
    
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
