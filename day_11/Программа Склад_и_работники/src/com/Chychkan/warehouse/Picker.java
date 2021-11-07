package com.Chychkan.warehouse;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Picker implements Worker {
 private long salary = 0;
 private static boolean isPayed;
 private static int countPickedOrders;

 public long getSalary() {
  return salary;
 }

 public int getCountPickedOrders() {
  return countPickedOrders;
 }

 public boolean isPayed() {
  return isPayed;
 }

 public Picker(int salary, boolean isPayed, Warehouse warehouse) {
  this.salary = salary;
  this.isPayed = isPayed;
  //warehouse.setCountPickedOrders(countPickedOrders);
 }

 public String toString(){
  return "salary= " + salary + "\nisPayed" + isPayed;
 }

 public void doWork(){
  salary += 80;
  countPickedOrders++;
  System.out.print("Сборщик заработал всего: " + getSalary() + "грн.");
  System.out.print(" Собрано заказов: " + getCountPickedOrders() + ". ");

  if (countPickedOrders == 5 && isPayed == false){
   bonus();
   System.out.println("Picker получил бонус +7000грн. УРААА!");
   isPayed = true;
  }
  else if(countPickedOrders > 5) System.out.println("Бонус сборщику уже был выплачен.");
  else System.out.println("Продолжайте работать, чтобы получить бонус.");
 }

 public void bonus(){
  if (countPickedOrders == 5){
   salary += 7000;
  }
 }
}