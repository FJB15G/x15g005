package jp.ac.chibafjb.x15g005.kd171;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int data[]={100,200,300,0};
		int k=3;
		int a=2;
		int b=0;
		for(int i=k;i>0;i-=1){
			//System.out.println("data["+i+"]"+"="+data[a]);
			data[i]=data[i-1];
			
		}
		for( int i=0;i<=k;i+=1){
			System.out.println("data["+i+"]"+"="+data[i]);
		
		}

	}

}
