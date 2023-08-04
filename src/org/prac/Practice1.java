package org.prac;

public class Practice1 {
	
	public static void main(String[] args) {
		
		int a[]= new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[2]=80;
		
		
		int length = a.length;
		System.out.println(length);
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
			
		
					
			for (int b : a) {
				System.out.println(b);
				
			}
		}
		
		
}	


//		int a[][]= new int [3][2];
//		
//		a[0][0]=10;
//		a[0][1]=20;
//		a[1][0]=30;
//		a[1][1]=40;
//		a[2][0]=50;
//		a[2][1]=50;
//		//System.out.println(a[2][0]);
//		
//		for (int i = 0; i<3; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.println(a[i][j]);
//				
//				for (int[] x : a) {
//					for (int y : x) {
//						System.out.println(y);
//						
//					}
//				}
//				
//			}
