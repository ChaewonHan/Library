package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem;
	private Book[] bList;

	public static int SIZE = 5;
	{
		mem = null;	// �� null������ �ʱ�ȭ �ϴ°ɱ�?
		bList = new Book[SIZE];
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	public Member myInfo() {
		return mem;
	}
	public Book[] selectAll() {
		return bList;
	}
	public Book[] seachBook(String keyword) {
		Book[] sBook = new Book[SIZE];
		int count = 0;
		for(int i=0; i<SIZE; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				sBook[count] = bList[i];
			}
			count++;
		}
		return sBook;
		
	}
	public int rentBook(int index) {
		int result = 0;
		if(bList[index] instanceof CookBook) {
			boolean coupon = ((CookBook)bList[index]).isCoupon();
			if(coupon == true) {
				mem.setCouponCount();
				result = 2;
				return result;
			}
		}
		else if(bList[index] instanceof AniBook) {
			int age = ((AniBook)bList[index]).getAccessAge();
			if(age <= 19) {
				result = 1;
				return result;
			}
		}
		return result;
		
	}
	
}
