package com.qhit.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		
		//��̬����
		int[] b={1,2,6};
		
		//��̬��������
		int[] scores=new int[10];
		
		scores[0]=95;
		scores[1]=92;
		scores[2]=91;
		scores[3]=75;
		scores[4]=95;
		scores[5]=95;
		scores[6]=99;
		scores[7]=93;
		scores[8]=90;
		scores[9]=95;
		
		System.out.println(Arrays.toString(scores));
		
	    //�������������,��С����
		Arrays.sort(scores);
		//�����ӡ�����е���Ϣ
		System.out.println(Arrays.toString(scores));
		
		int[] cc=new int[10];
		for (int i = scores.length-1; i >=0; i--) {
			
			cc[scores.length-1-i] = scores[i];
			
		}
		
		System.out.println(Arrays.toString(cc));
		//�������в�ѯ�Ƿ����һ��ֵ,���ڷ��ض�Ӧ�±�,�����ڷ���-1
		//int c=  Arrays.binarySearch(scores,10);
		//System.out.println(c);
		
		//ת����list����
		//List s= Arrays.asList(scores);
		//�Ƚ������е�Ԫ���Ƿ�һ��,һ������true��һ������false
		//boolean  k=  Arrays.equals(b, scores);
		//System.out.println(k);
		
		
		
		
		
		
		
		
	}
	
	

}
