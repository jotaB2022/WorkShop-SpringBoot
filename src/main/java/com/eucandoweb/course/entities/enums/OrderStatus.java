package com.eucandoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERD(4),
	CANCELED(5);
	
	private Integer code;
	
	private OrderStatus(int code) {
		this.code= code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(Integer code) {
		for(OrderStatus itemValue : OrderStatus.values()) {
			if( itemValue.getCode() == code) {
				return itemValue;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
