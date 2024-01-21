import java.time.LocalDate;

public class ShoppingMall {

  public String name;
  public int area;
  public Cinema cinema;
  public String[] shopCategory;


  public ShoppingMall(String name, int area, Cinema cinema, String[] shopCategory) {
    this.name = name;
    this.area = area;
    this.cinema = cinema;
    this.shopCategory = shopCategory;
  }

  public static void main(String[] args) {
    Film filma = new Film("film A",LocalDate.of(2022,1,1));
    Film filmb = new Film("film B",LocalDate.of(2022,1,2));
    Film[] films = new Film[] {filma, filmb};

    Cinema cinemaa = new Cinema("Cinema A",LocalDate.of(2022,1,1),films);

    String[] shopCategory = new String[] {"Sport","Food","Clothing"};

    ShoppingMall shoppingmall = new ShoppingMall("K11", 19000,cinemaa,shopCategory);

  }



  }

    
    


