package poker2.model;

public class Card {
  
  private Suit suit;
  private Rank rank;

  private Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
    
  }

  private Card(Suit suit) {
    this.suit = suit;
  }

  private Card(Rank rank) {
    this.rank = rank;
  }

  public static Card of(Rank rank, Suit suit) {
    return new Card(rank, suit);
  }


  public void setSuit(Suit suit) {
    this.suit = suit;
  }

  public void setRank(Rank rank) {
    this.rank = rank;
  } 

  public Suit getSuit() {
    return this.suit;
  }

  public Rank getRank() {
    return this.rank;
  }

  public String toString() {
    return "Card(suit=" + this.suit + ", rank=" + this.rank + ")";
  }

}

// public enum Card{

//   DIAMONDACE(Suit.DIAMOND,Rank.ACE),
//   DIAMONDONE(Suit.DIAMOND,Rank.ONE),
//   DIAMONDTWO(Suit.DIAMOND, Rank.TWO),
//   DIAMONDTHREE,DIAMONDFOUR,DIAMONDFIVE,DIAMONDSIX,
//   DIAMONDSEVEN,
//   DIAMONDEIGHT,
//   DIAMONDNINE,
//   DIAMONDTEN,
//   DIAMONDJACK,
//   DIAMONDQUEEN,
//   DIAMONDKING,
//   CLUBACE, CLUBONE, CLUBTWO, CLUBTHREE, CLUB, CLUB, CLUB, 
//   CLUB, CLUB, CLUB, CLUB, CLUB, CLUB, CLUB, CLUB,
//   ;

//   public Card(Suit suit, Rank rank) {
//     this.suit = suit;
//     this.rank = rank;
//   }
//}
