package team4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	
		BeverageDTO beverageDTO = new BeverageDTO();
		Scanner sc = new Scanner(System.in);

		
	
	public void Run() {
		
		
		while(true) {
		System.out.println("1. 수량 파악");
		System.out.println("2. 주문");
		System.out.println("9. 프로그램 종료");
		int no = sc.nextInt();
		
		switch(no) {
		case 1 : 
			amount(0);	// 수량 파악 메소드
			break;
		case 2 :
			order();	// 주문 메소드
			break;
		case 9 :
			System.out.println("프로그램을 종료합니다");
			return;
		default : 
			System.out.println("번호를 다시 입력해주세요.");
			break;
		}
		
		}
	}	
		
	

	public  void order() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어떤 음료를 주문하시겠어요?");
		System.out.println("아메리카노(1번), 라떼 (2번)");
		int orderNum = sc.nextInt();
		
		switch(orderNum) {
		case 1: 
			americano();
			break;
		case 2 :
			
			break;
		
		default : 
			System.out.println("다시 입력해주세요");
			break;
		
		
		}
		
	}

	public  void americano() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 잔을 주문하시겠어요?");
		int ameJan = sc.nextInt();
		amount(ameJan);
		
	}

	

	public  void amount(int ameJan) {
		
//		System.out.println(ameJan);
		
		ArrayList americano = new ArrayList();
		ArrayList latte = new ArrayList();
		
		americano.add("아메리카노");
		americano.add(100);
		
		if(ameJan  == 0) {
			System.out.println("현재 아메리카노의 수량은 " + americano.get(1));

		}else {
			int ameJan1 = (int) americano.get(1);
			int remain = ameJan1 - ameJan;
			americano.set(1, remain);
			System.out.println("현재 아메리카노의 수량은 : " + americano.get(1));
		}
		
		
		latte.add("라떼");
		latte.add(80);
		
		/*
		 * 구현 해야하는 것
		 * 1. 주문한 음료의 개수를 받는다
		 * 2. 주문한 음료의 개수만큼 재고에서 차감되어 출력된다.
		 * 
		 * + 주문을 하지 않으면 초기값이 계속 나오게 한다.
		 * 
		 * 
		 */
		
//		System.out.println("현재 아메리카노의 수량은 " + americano.get(1));
//		System.out.println("현재 라떼의 수량은 " + latte.get(1));
		
		
	}
	
	

}
