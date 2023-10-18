package fighting;

public class God implements Fighter {
  
  private int attack;

  private Hp hp;

  public God(int attack, int hpValue) {
    this.attack = attack;
    this.hp = new Hp(300);
  }

  public void fight() {

  }

  public void bleed() {
    
  }

}
