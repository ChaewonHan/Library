package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{ //�丮�п� ���� �˻�
	private boolean coupon;
	
	public CookBook() {}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title,author,publisher);
		this.coupon = coupon;
	}
	
	public String toString() {
		return super.toString()+"coupon="+isCoupon()+"]";
	}
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

}
