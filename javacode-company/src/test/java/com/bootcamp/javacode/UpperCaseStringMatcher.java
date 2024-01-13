package com.bootcamp.javacode;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class UpperCaseStringMatcher extends TypeSafeMatcher<String>{
  
  @Override
  protected boolean matchesSafely(String item) {
    return item.matches("[A-Z]+");
  }

  @Override
  public void describeTo(Description description) {
    description.appendText("A String containing only upper string");
  }

  public static Matcher<String> containOnlyUpperCase() {
    return new UpperCaseStringMatcher();
  }
}
