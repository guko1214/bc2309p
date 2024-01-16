package com.vtxlab.tdd;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*; //
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AccountTest {
  
  private Account account;

  @BeforeEach
  void init() {
    account = new Account(0);
  }

  @Test
  void testCredit() {
    assertThat(account.credit(10), is(true));
    assertThat(account.getBalance(),is(10));

    assertThat(account.credit(20), is(true));
    assertThat(account.getBalance(),is(30));
  }

  @Test
  void testDebit() {
    assertThat(account.credit(12), is(true));
    assertThat(account.debit(10), is(true));
    assertThat(account.getBalance(),is(2));

    assertThat(account.debit(3), is(false));
    assertThat(account.getBalance(),is(2));
  }

}
