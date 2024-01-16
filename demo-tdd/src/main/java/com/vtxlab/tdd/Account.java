package com.vtxlab.tdd;

public class Account {
  
  private int balance;

  public Account(int balance) {
    this.balance = balance;
  }

  public boolean credit(int amount) {
    this.balance += amount;
    return true;
  }

  public boolean debit(int amount) {
    if (this.balance < amount) {
      return false;
    } else {
      this.balance -= amount;
      return true;
    }
    
  }

  public int getBalance() {
    return balance;
  }

}
