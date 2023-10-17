package com.test01;

public class DiArrayTest {
	/* [2차원 배열]
	 * 1차원 배열과 특징 공유
	 * 단, 1차원 배열(행)에는 값이 바로 들어갔지만,
	 * 2차원배열에서는 두번째 배열(열)의 각 주소 값이 각각의 첫번째 배열에 들어간다.
	 */

	public static void main(String[] args) {
		DiArrayTest da = new DiArrayTest();
		da.testInit01();

	}
	
	public void testInit01() {
		//2차원 배열 선언
		//자료형[][] 배열명;
		//자료형 배열명[][];
		//자료형[] 배열명[];
		
		int [][] iarr1;
		int iarr2 [][];
		
		//2차원 배열 할당
		//new 자료형 [][];
		//heap영역에 배열의 공간을 생성한다.
		//선언과 할당 동시에 가능하다.
		
		iarr1 = new int [3][5];
		
		iarr2 = new int[3][];//두번째 배열 선언하지 않아도 괜찮다.
		iarr2[0] = new int[5];//추후에 이렇게 두번째 배열을 선언 가능.
		iarr2[1] = new int[3];
		iarr2[2] = new int[5];
		//각 행과 열이 각각 일정한 값을 가진 배열을 정변 배열. 각각 다른 값을 가진 배열을 가변 배열이라한다.
		
		//배열의 값을 출력하는 이중 for문
		for(int i = 0; i < iarr2.length; i++){//iarr2.length는 iarr의 첫번째 배열(행)의 길이를 의미한다.
			
			System.out.println(iarr2[i]);//iarr2의 첫번째 배열(행)을 출력한다.
			
		}
		
		for(int i = 0; i < iarr2.length; i++){//iarr2.length는 iarr의 첫번째 배열(행)의 길이를 의미한다.
			
			for(int j = 0; j < iarr2[i].length; j++) {
			//iarr2[i]는 iarr2의 첫번째 배열로, 각각 두번째 배열의 주소 값을 갖고 있으므로 두번째 배열의 길이를 의미.
			//첫번째 배열의 i번째 인덱스가 갖고 있는 두번째 배열의 주소 값.length이므로 각각 두번째 배열의 길이를 의미한다.
				System.out.print(iarr2[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		//2차원 배열에 값 기록
		//인덱스로 접근하여 값 기록
		
		iarr1[0][0] = 1;
		iarr1[0][1] = 2;
		iarr1[0][2] = 3;
		iarr1[1][1] = 4;
		iarr1[1][4] = 5;
		iarr1[2][1] = 6;
		iarr1[2][3] = 7;
		
		printArr(iarr1);//iarr1을 printArr 메소드로 전달.
		
		//다차원 배열의 할당과 초기화를 동시에 할 수 있다.
		int [][] iarr3 = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
		
		printArr(iarr3);
		
	}
	
	//2차원 배열을 전달받아 출력하는 메소드
	public void printArr(int[][] iarr) {
		
		for(int i = 0; i < iarr.length; i++) {//iarr.length는 iarr의 첫번째 배열 길이
			
			for(int j = 0; j < iarr[i].length; j++) {//iarr[i].length는 iarr의 두번째 배열 길이
			//첫번째 배열의 i번째 인덱스가 갖고 있는 두번째 배열의 주소 값.length -> 각 두번째 배열의 길이
				
				System.out.print("\t" + iarr[i][j]);
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
	}
	
}
