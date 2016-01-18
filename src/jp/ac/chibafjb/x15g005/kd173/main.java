package jp.ac.chibafjb.x15g005.kd173;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    int[] data={100,200,300,0};
		int k=3;
		Scanner sin=new Scanner(System.in);
		
		for(int i=0;i<=k;i+=1){
			int a=sin.nextInt();
			data[i]=a;
		}
		for( int i=0;i<=k;i+=1){
			System.out.println("data["+i+"]"+"="+data[i]);
		
		}
	   

	}

}
