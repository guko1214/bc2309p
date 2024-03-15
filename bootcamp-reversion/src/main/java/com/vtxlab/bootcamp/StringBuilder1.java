package com.vtxlab.bootcamp;

public class StringBuilder1 {
  
  public static void main(String[] args) {
    // StringBuilder non-thread safe
    StringBuilder sb = new StringBuilder();
    
    sb.append("hello");
    appendOne(sb);
    System.out.println(sb.toString()); // helloOne
    String result = appendOne2(sb);
    System.out.println(result); // helloOne


    String s = new String();
  }

  public static void appendOne(StringBuilder sb) {
    sb.append("One");
  }

  public static String appendOne2(StringBuilder sb) {
    return sb.append("One").toString();
  }
}
