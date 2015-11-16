package jp.ac.chibafjb.x15g005.kd151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin=new Scanner(System.in);
		System.out.print("aの入力→");
		float s1=sin.nextFloat();
		System.out.print("bの入力→");
		float s2 = sin.nextFloat();
		float a=s1+s2;
		System.out.println(s1+"+"+s2+"="+a);
		float b=s1-s2;
		System.out.println(s1+"-"+s2+"="+b);
		float c=s1*s2;
		System.out.println(s1+"*"+s2+"="+c);
		float d=s1/s2;
		System.out.println(s1+"/"+s2+"="+d);
		

	}

}
