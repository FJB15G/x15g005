package jp.ac.chibafjb.x15g005.kd171;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int data[]={100,200,300,0};
		int k=3;
		int a=0;
		int b=0;
		for(int i=0;i<=k;i=i+1){
			System.out.println("data["+i+"]"+"="+data[a]);
			a+=1;
			data[a]=data[b];
			b+=1;
		}

	}

}
