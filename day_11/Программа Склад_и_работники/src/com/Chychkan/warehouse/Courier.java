package com.Chychkan.warehouse;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Courier implements Worker {
	private long salary;
	private boolean isPayed;
	private int countDeliveredOrders;

	public long getSalary() {
		return salary;
	}

	public int getCountDeliveredOrders() {
		return countDeliveredOrders;
	}

	public boolean isPayed() {
		return isPayed;
	}

	public Courier(int salary, boolean isPayed, Warehouse warehouse) {
		this.salary = salary;
		this.isPayed = isPayed;
		countDeliveredOrders = warehouse.getCountDeliveredOrders();
	}

	public String toString() {
		return "salary= " + salary + "\nisPayed" + isPayed;
	}


	public void doWork() {
		salary += 100;
		countDeliveredOrders++;
		System.out.print("Курьер заработал всего: " + getSalary() + "грн.");
		System.out.print(" Доставлено заказов: " + getCountDeliveredOrders() + ". ");

		if (countDeliveredOrders == 5 && isPayed == false) {
			bonus();
			System.out.println("Курьер получил бонус +5000грн. УРААА!");
			isPayed = true;
		} else if (countDeliveredOrders > 5) {
			System.out.println("Бонус курьеру уже был выплачен.");
		} else System.out.println("Продолжайте работать, чтобы получить бонус.");
	}

	public void bonus() {
		if (countDeliveredOrders == 5) {
			salary += 5000;
		}
	}
}

