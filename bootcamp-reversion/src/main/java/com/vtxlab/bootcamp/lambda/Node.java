package com.vtxlab.bootcamp.lambda;

import java.util.LinkedList;
import java.util.List;

public class Node {
  
  int val;

  Node node;

  public Node get(int idx) {
    Node head = this;
    // for (int i = 0; i <= idx; i++) {
    //   head = this.node;
    //   if (i == idx)
    //     return head;
    // }
    while (--idx > 0) {
      head = head.node;
    }

    return head;
  }

  public static void main(String[] args) {
    Node node = new Node();

    List<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.get(3); // LinkedList: 0 -> 1 -> 2 -> 3; ArrayList: arr[3]
  }

}
