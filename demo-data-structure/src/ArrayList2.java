public class ArrayList2 {
  
  private Integer[] integers;

  public ArrayList2() {
    this.integers = new Integer[0];
  }

  public Boolean add(Integer integer) { // 10
    // you need to have a new array with length 1
    Integer[] newIntegers = new Integer[this.integers.length + 1];
    // for (int i = 0; i < this.integers.length; i++) {
    //   tempIntegers[i] = this.integers[i];
    // }
    int i = 0;
    // O(n)
    for (Integer old : this.integers) { // loop n times
      newIntegers[i++] = old;
    }
    //newIntegers[this.integers.length] = integer;
    //newIntegers[newIntegers.length - 1] = integer;
    newIntegers[i] = integer;
    this.integers = newIntegers; // !!!!???
    return true;    
  }

  public Integer[] getIntegers() {
      return this.integers;
  }

  public Integer set(int index, Integer newInteger) {
    // return the old element
    Integer old = this.integers[index];
    this.integers[index] = newInteger;
    return old;
  }

  public Integer get(int index) {
    return this.integers[index];
  }

  public int indexOf(Integer integer) {
    for (int i = 0; i < this.integers.length; i++) {
      if (this.integers[i].equals(integer)) {
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(Integer integer) {
    for (int i = this.integers.length - 1; i >= 0; i--) {
      if (this.integers[i].equals(integer)) { // use equals() to compare object's value
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    ArrayList2 arrayList = new ArrayList2();
    arrayList.add(10);
    arrayList.add(1);
    arrayList.add(100);
    arrayList.add(-50);
    for (Integer integer : arrayList.getIntegers()) {
      System.out.println(integer);
    }

    Integer oldValue = arrayList.set(1,35);
    System.out.println(oldValue);
    System.out.println(arrayList.get(1));    
    for (Integer integer : arrayList.getIntegers()) {
      System.out.println(integer);
    }

    arrayList.add(100);
    System.out.println(arrayList.lastIndexOf(100));
    System.out.println(arrayList.indexOf(100));


  }


}
