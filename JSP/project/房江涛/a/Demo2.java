package com.qhit.a;

public class Demo2 {
	
	public static void main(String[] args) {
		//int[][] b=  {{2001,90,80},{2002,99},{2003,89,97}};
		
		int[][] a=new int[3][3];
		a[0][0]=2001;
		a[0][1]=90;
		a[0][2]=80;
		
		a[1][0]=2002;
		a[1][1]=91;
		a[1][2]=81;
		
		a[2][0]=2003;
		a[2][1]=70;
		a[2][2]=95;
		
	//Ĭ��java�������ɼ� ���ѧ��	
	int maxJava=a[0][1];
	int maxJXH=a[0][0];
	
	//Ĭ�ϵ�C���Գɼ����
	int maxC=a[0][2];
	int maxCXH=a[0][0];
		
	for (int i = 0; i < a.length; i++) {
		
		if(a[i][1]>maxJava){
			
			maxJava=a[i][1];
			maxJXH=a[i][0];
			
		}
		
		
      if(a[i][2]>maxC){
			
    	    maxC=a[i][2];
    	    maxCXH=a[i][0];
			
		}
		
		
	}
	
	
	System.out.println("java�ɼ������"+maxJava+"ѧ����:"+maxJXH);
	System.out.println("C�ɼ������"+maxC+"ѧ����:"+maxCXH);
	
		
		
		
	}
	

}
