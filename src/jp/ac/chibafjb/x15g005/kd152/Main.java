package jp.ac.chibafjb.x15g005.kd152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin=new Scanner(System.in);
		System.out.print("半径r→");
		float s1=sin.nextFloat();
		float s3=3.14f;
		float a=2*s3*s1;
		System.out.println("円周　＝"+a);
		float b=s3*s1*s1;
		System.out.println("面積　＝"+b);

	}

}
