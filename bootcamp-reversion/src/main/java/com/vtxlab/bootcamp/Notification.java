package com.vtxlab.bootcamp;

public class Notification implements SMS, Email {

  private String target;

  public Notification() {
    this.target = "default";
  }

  public Notification(String target) {
    this.target = target;
  } 

  @Override
  public void sms() {
    System.out.println("sending sms ......");
  }

  @Override
  public void email() {
    System.out.println("sending email ......");
  }

  public static void main(String[] args) {
    Notification notification = new Notification();
    notification.sms();
    notification.email();

    // Polymorphism
    Email emailSender = new Notification();
    emailSender.email();

    //emailSender = new Dog();

    SMS smsSender = (SMS) emailSender; // risk???? runtime error if cast class type have not the called method
    smsSender.sms();
    // smsSender.email();

  }
}
