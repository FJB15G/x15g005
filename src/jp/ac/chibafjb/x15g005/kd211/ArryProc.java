package jp.ac.chibafjb.x15g005.kd211;

public class ArryProc {

		public static int maxFind1(int num[],int s1){
			int m=0;
			for(int i=0;i<=s1;i++){
				if(m<num[i]){
					m=num[i];
					}
				}
			return (m);
		}
		
		public static int maxFind2(int num[],int s1){
			int m=num[0];
			for(int i=1;i<=s1;i++){
				if(m<num[i]){
					m=num[i];
					}
				}
			return (m);
		}

}
