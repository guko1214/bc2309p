package com.vtxlab.bootcamp;

// Backend enum
// status (Ordered, Shipped, Paid, etc)
// Country code (HK,UK,etc)
// VIP (Gold, Silver)

// Frontend enum;
// Dropdown box (Occuption, salary range, etc..)
public enum Currency {
  HKD("Hong Kong Dollar"),
  USD("USA Dollar"),
  CNY("Yue c"),
  ;

  private String desc;

  private Currency(String desc) {
    this.desc = desc;
  }

  public String getDesc() {
    return this.desc;
  }
  
}
