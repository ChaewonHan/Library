package com.kh.practice.chap01_poly.model.vo;

public class Member { // 회원정보 저장하는 곳
	private String name;
	private int age;
	private char gender;
	private int couponCount = 0;
	
	public Member() {}
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int setCouponCount() {
		return couponCount++;
	}
	public int getCouponCount() {
		return couponCount;
	}
	public String toString() {
		return "Member [name="+getName()+", age="+getAge()+", gender="+getGender()+", couponCount="+getCouponCount()+"]";
	}
}
