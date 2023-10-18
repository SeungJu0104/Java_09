package com.silsub1.model;

import java.util.Scanner;

public class Sample {
	
	Scanner scn = new Scanner(System.in);
	
	public void munjae1() {
		
		int [][] arr = new int [4][4];
		
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				arr[i][j] = ((int)(Math.random()*100))+1;
			}
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				//arr[i][arr[i].length] += arr[i][j];
				arr[i][arr[i].length-1] += arr[i][j];
				arr[arr[i].length-1][i] += arr[j][i];
			}
			//System.out.println(i+ "행 "  + "합계 " + arr[i][arr[i].length-1]);
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			arr[arr.length-1][arr[i].length-1] += arr[arr.length-1][i];
			arr[arr.length-1][arr[i].length-1] += arr[i][arr[i].length-1];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//System.out.println(arr[0][3]);
		
		
	}
	
	public void munjae2() {
		
		int [][] iarr = new int [3][];
		
		int ytmp = 0;
		
		//각 행별 열 개수 입력
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(i + "행의 열 개수 입력 : ");
			int no = scn.nextInt();
			iarr[i] = new int [no];
		}
		
		//임의의 정수를 2차원 배열에 넣어 초기화
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = ((int)(Math.random()*100))+1;
			}
		}
		
		//초기화한 2차원 배열 출력
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
		
		//각 열별 행의 합계가 5의 배수인 행열값만 출력
		for(int i = 0; i < iarr[i].length; i++) {
			for(int j = 0; j < iarr.length; j++) {
				ytmp += iarr[j][i];
			}
			System.out.println(ytmp);
			if(ytmp % 5 == 0) {
				for(int k = 0; k < iarr.length; k++) {
					System.out.println("(" + k + " , " + i + ") : " + iarr[k][i]);
				}
			}
			ytmp = 0;
		}
	}
	
	
	
	
	
	
	

}
