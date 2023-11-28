public class Runner<T extends Animal> {
  
  private T object;

  public Runner(T object) {
    this.object = object;
  }

  public Runner() {
    
  }

  public T getT() {
    return this.object; // instance method must return Animal or child class of Animal 
                        // since restriction of Animal or child class of Animal already when defining the class 
                        // no require to define restriction of return type 
  }

  public static <T extends Animal> Runner<T> getRunner() { // static method is not belong to the object, no former restriction
                                                           // so define of the restriction is required
    return null;
  }

  public static void main(String[] args) {
    
    Runner<Dog> dogRunner = new Runner<>(new Dog());
  Runner<Dog> dogRunner2 = new Runner<>();

  // Runner<Person> personRunner = new Runner<>(new Person()); // not allowed since Person is not Animal of child class of Animal



  }

}
