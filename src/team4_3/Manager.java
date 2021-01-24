package team4_3;

import java.util.ArrayList;
import java.util.Scanner;

import team4.LoginDTO;

public class Manager {
	
		BeverageDTO beverageDTO = new BeverageDTO();
		Scanner sc = new Scanner(System.in);
		ArrayList<BeverageDTO> americano = new ArrayList<>();	// 아메리카노 1차원 배열
		ArrayList<BeverageDTO> latte = new ArrayList<>();	// 라떼 1차원 배열

		
	
	public void Run() {
		
		
		while(true) {
		System.out.println("1. 수량 파악");
		System.out.println("2. 음료 주문");
		System.out.println("9. 프로그램 종료");
		int no = sc.nextInt();
		
		switch(no) {
		case 1 : 
			stock();	// 수량 파악 메소드
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
		
	

	public  void order() {			// 주문 메소드
		Scanner sc = new Scanner(System.in);
//		stock();
		System.out.println("어떤 음료를 주문하시겠어요?");		// 음료선택
		System.out.println("아메리카노(1번), 라떼 (2번)");	//아메인지 라떼인지 선택
		int orderNum = sc.nextInt();
		
		switch(orderNum) {
		case 1: 
			System.out.println("몇 잔을 주문하시겠어요?");
			int ameJan = sc.nextInt();						// 아메리카노 주문
			System.out.println("주문하신 아메리카노는 " + ameJan + "잔 입니다.");
			
			beverageDTO.setOrderAmeJan(ameJan);
			break;
		case 2 :
//			latte();									// 라떼 주문
			break;
		
		default : 
			System.out.println("다시 입력해주세요");
			break;
		
		
		}
		
	}

//	public void latte() {							// 라떼 주문시
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇 잔을 주문하시겠어요?");
//		int latteJan = sc.nextInt();
//		amount(0, latteJan);						//라떼값 입력
//	}



//	public  void americano() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇 잔을 주문하시겠어요?");
//		int ameJan = sc.nextInt();
//		amount(ameJan, 0);							// 아메값 입력
//		
//	}

	

	public  void stock() {
		
//		System.out.println(ameJan);
		
		ArrayList americano = new ArrayList();
		ArrayList latte = new ArrayList();
	
		
		americano.add("아메리카노");
		americano.add(100);
		latte.add("라떼");
		latte.add(80);
		
		int ameJan = beverageDTO.getOrderAmeJan();
		int latteJan = beverageDTO.getOrderLatteJan();
		
		
		if(ameJan  == 0) {				// 아메리카노 수량 확인, 주문이 없을 시 재고 수량 그대로 출력
			System.out.println("현재 아메리카노의 수량은 " + americano.get(1));

		}else {							// 아메리카노 주문시 수량만큼 빼고 출력
			int ameJan1 = (int) americano.get(1);
			int remain = ameJan1 - ameJan;
			americano.set(1, remain);
			System.out.println("현재 아메리카노의 수량은 : " + americano.get(1));
		}
		
		if(latteJan  == 0) {
			System.out.println("현재 라떼의 수량은 " + latte.get(1));

		}else {
			int latteJan1 = (int) latte.get(1);
			int remain = latteJan1 - latteJan;
			latte.set(1, remain);
			System.out.println("현재 아메리카노의 수량은 : " + latte.get(1));
		}
		
		
		/*
		 * 구현 못한 것
		 * 문제점!!
		 * 1. 주문 후 주문 완료 메세지만 떠야하는데 재고 수량까지 뜸
		 * 2. 주문 후 재고 수량 확인하면 초기화 됨.
		 * 
		 * 
		 */
		
//		System.out.println("현재 아메리카노의 수량은 " + americano.get(1));
//		System.out.println("현재 라떼의 수량은 " + latte.get(1));
		
	}
	
	public void Cal() {
		
		
		
		
		
		return ;
	}

}
