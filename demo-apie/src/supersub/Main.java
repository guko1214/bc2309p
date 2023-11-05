package supersub;

public class Main {
  public static void main(String[] args) {
    SubClass obj = new SubClass();
    System.out.println(obj.number); // 
    System.out.println(obj.check());
    System.out.println(((SuperClass) obj).number);
    System.out.println(((SuperClass) obj).check());
    SuperClass obj2 = (SuperClass) obj;
    System.out.println(obj2.number);
    System.out.println(obj2.check());

    SuperClass superClass = new SubClass();
    System.out.println(superClass.number); // 5 call class variable of object reference (left) (SuperClass)
    System.out.println(((SubClass) superClass).number); // 10 class variable of object reference (left) (SubClass)
    
  }
}
