package team4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 재고관리
		
		/*
		 * 1. 2차원 배열로 아아, 아라로 상품/아이스 or 핫 / 수량 입력
		 * 2. 1) 수량 파악
		 * 3. 2) 임의로 수량을 제거
		 * 4. 3) 수량 파악시 임의로 제거한 수량만큼 감소
		 * 5. 
		 * 
		 * 예시)
		 * switch문으로
		 * 1번 수량 파악
		 * 아아 100잔
		 * 아라 100잔
		 * 
		 * 2번 주문
		 * 아아 두잔
		 * 아라 한잔
		 * 
		 * 1번 수량 파악
		 * 아아 98잔
		 * 아라 99잔
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 수량 파악");
		System.out.println("2. 주문");
		System.out.println("9. 프로그램 종료");
		int no = sc.nextInt();
		
		switch(no) {
		case 1 : 
			amount();	// 수량 파악 메소드
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

	public static void order() {
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

	public static void americano() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 잔을 주문하시겠어요?");
		int jan = sc.nextInt();
		
		
		
	}

	public static void amount() {
		americano();
		
		ArrayList americano = new ArrayList();
		ArrayList latte = new ArrayList();
		
		americano.add("아메리카노");
		americano.add(100);
		
		latte.add("라떼");
		latte.add(80);
		
		
		
		
		
		
	}

}
