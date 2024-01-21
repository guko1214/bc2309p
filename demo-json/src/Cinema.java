import java.time.LocalDate;

public class Cinema {
  public String name;
  public LocalDate openedDate;
  public Film[] releasedFilms;

  public Cinema(String name, LocalDate openedDate, Film[] releasedFilms) {
    this.name = name;
    this.openedDate = openedDate;
    this.releasedFilms = releasedFilms;
  }
}
