package jp.ac.chibafjb.x15g005.kd165;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a[]={5,10,15};
		int b[]={1,2,3};
		int m=2;
		for(int i=0;i<=m;i++){
			b[i]=a[m-i];
			System.out.println("b["+i+"]"+"="+b[i]);
		}

	}

}
