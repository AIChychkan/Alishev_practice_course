package com.Chychkan.warehouse;

/**
 * Created by A.I.Chychkan on 25/10/2021
 */
public class Warehouse {
	private int countPickedOrders;
	private int countDeliveredOrders;

	public void setCountPickedOrders(int countPickedOrders) {
		this.countPickedOrders = countPickedOrders;
	}

	public void setCountDeliveredOrders(int countDeliveredOrders) {
		this.countDeliveredOrders = countDeliveredOrders;
	}

	public int getCountPickedOrders() {
		return countPickedOrders;
	}

	public int getCountDeliveredOrders() {
		return countDeliveredOrders;
	}

	public Warehouse(int countPickedOrders, int countDeliveredOrders) {
		this.countPickedOrders = countPickedOrders;
		this.countDeliveredOrders = countDeliveredOrders;
	}

	public String toString(){
		return "countPickedOrders= " + countPickedOrders + "\ncountDeliveredOrders" + countDeliveredOrders;
	}
}