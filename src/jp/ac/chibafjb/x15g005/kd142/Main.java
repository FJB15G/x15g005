package jp.ac.chibafjb.x15g005.kd142;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("整数aの入力→");
		String s1=sin.next();
		System.out.print("整数bの入力→");
		String s2=sin.next();
		sin.close();
		int a=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(s1+"+"+s2+"="+a);
		int b=Integer.parseInt(s1)-Integer.parseInt(s2);
		System.out.println(s1+"-"+s2+"="+b);
		int c=Integer.parseInt(s1)*Integer.parseInt(s2);
		System.out.println(s1+"*"+s2+"="+c);
		int d=Integer.parseInt(s1)/Integer.parseInt(s2);
		System.out.println(s1+"/"+s2+"="+d);
	}

}
