package jp.ac.chibafjb.x15g005.kd172;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x[]={1,2,3};
		int y[]={7,8};
		int z[]={0,0,0,0,0};
		int m=3;
		int n=2;
		int i;
		System.out.print("z[]={");
		for( i=0;i<m;i++){
			z[i]=x[i];
			System.out.print(z[i]);
		}
		for( i=0;i<n;i++){
			z[i+3]=y[i];
			System.out.print(z[i+3]);
		}
		System.out.println("}");
		
		

	}

}
