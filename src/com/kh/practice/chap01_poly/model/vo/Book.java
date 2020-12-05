package com.kh.practice.chap01_poly.model.vo;

public class Book { //책 관련 정보 저장
	private String title; // 도서
	private String author; // 저자
	private String publisher; // 출판사
	
	public Book() {}
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String toString() {
		return "[Book [title="+getTitle()+", author="+getAuthor()+", "
				+ "publisher="+getPublisher()+"], ";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
