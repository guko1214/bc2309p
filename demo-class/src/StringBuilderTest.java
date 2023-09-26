public class StringBuilderTest {
public static void main(String[] args) {
  StringBuilder s = new StringBuilder(); // constructor
  s.append("hello"); // stringBuilder is obj ref
  // append is a method
  s.append("world");
  System.out.println(s.toString()); // helloworld

  System.out.println(s.append(" ").append("something").toString()); // hello something
  System.out.println(s.toString()); // hello something
  System.out.println(s.append(" ").append("something").toString()); // hello something something

  String str = s.toString();
  System.out.println(str);

  // 1- 10, even number, by using StringBuilder
  // result -> "246810"
  StringBuilder s2 = new StringBuilder();
  for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0)
      // s2 += String.valueOf(i); this is very slow, use StringBuilder faster 10x 
      s2.append(i);
  }
  System.out.println(s2.toString()); // 246810
  System.out.println(s2.length());
  System.out.println(s2.capacity());
  
  }
}
