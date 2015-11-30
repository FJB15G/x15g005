package jp.ac.chibafjb.x15g005.kdT21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a=100;
		int b=180;
		Scanner sin=new Scanner(System.in);
		System.out.print("ハンバーガーの個数　　　→");
		float a1=sin.nextFloat();
		System.out.print("フライドポテトの個数　　→");
		float b1=sin.nextFloat();
		float a2=a1*a;
		System.out.println("ハンバーガーの代金　　＝"+a2+"円");
		float b2=b1*b;
		System.out.println("フライドポテトの代金　＝"+b2+"円");
		float c=a2+b2;
		System.out.println("小計　　　　　　　　　＝"+c);
		float c1=c*0.08f;
		System.out.println("消費税　　　　　　　　＝"+Math.floor(c1*1)/1+"円");
		float c2=c1+c;
		System.out.println("合計金額　　　　　　　＝"+Math.floor(c2*1)/1+"円");
		System.out.print("受取金額　　　　　　　→");
		float d=sin.nextFloat();
		float d1=d-c2;
		System.out.println("つり銭　　　　　　　　＝"+Math.floor(d1*1)/1+"円");
		
		

	}

}
