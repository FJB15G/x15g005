package jp.ac.chibafjb.x15g005.kd211;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("長さを入力してください");
		Scanner sin =new Scanner(System.in);
		int num[]={1,4,3,6};
		int s1=sin.nextInt();
		System.out.println(ArryProc.maxFind1(num,s1));
		System.out.println(ArryProc.maxFind2(num,s1));

}

}



