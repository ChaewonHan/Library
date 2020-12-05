package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() { // ���� �޴� ���
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		int age = sc.nextInt();
		System.out.print("����: ");
		char gender = sc.next().charAt(0);
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		while(true) { 
			System.out.println("===== �޴� =====");
			 System.out.println("1. ����������");
			 System.out.println("2. ���� ��ü ��ȸ");
			 System.out.println("3. ���� �˻�");
			 System.out.println("4. ���� �뿩�ϱ�");
			 System.out.println("9. ���α׷� �����ϱ�");
			 System.out.print("�޴� ��ȣ: ");
			 int menuNum = sc.nextInt();
			 switch(menuNum) {
			 case 1:
				 System.out.println(lc.myInfo());
				 break;
			 case 2:
				 selectAll();
				 break;
			 case 3:
				 searchBook();
				 break;
			 case 4:
				 rentBook();
				 break;
			 case 9:
				 System.out.println("���α׷��� �����մϴ�.");
				 return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			 }
		}
	}
	public void selectAll() { // ���� ��ü ��� ���
		Book[] All = lc.selectAll();
		for(int i=0; i<All.length; i++)
			System.out.println(i+"�� ���� : "+All[i]);
	}
	public void searchBook() { // �˻� ���� Ű���� �Է¹ް� ��� ���
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.next();
		Book[] key = lc.seachBook(keyword);
		for(int i=0; i<lc.SIZE; i++) {
			if(key[i] != null)
				System.out.println(key[i]);
		}
	}
	public void rentBook() { // �뿩���� �ε��� �Է¹޾Ƽ� ����
		selectAll();
		while(true) {
			System.out.print("�뿩�� ���� ��ȣ ���� : ");
			int index = sc.nextInt();
			if(0 <= index && index < lc.SIZE) {
				int result = lc.rentBook(index);
				if(result == 0)
					System.out.println("���������� �뿩�Ǿ����ϴ�.");
				else if(result == 1)	
					System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
				else if(result == 2)
					System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���");
				return;
			}
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
