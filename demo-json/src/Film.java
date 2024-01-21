import java.time.LocalDate;

public class Film {
  public String name;
  public LocalDate releaseDate;

  public Film(String name, LocalDate releaseDate) {
    this.name = name;
    this.releaseDate = releaseDate;
  }
}