package com.qhit.a;

public class Demo5 {
	
	public static void main(String[] args) {
		
		//String w="ccccccc";
		StringBuffer sb=new StringBuffer("ccccccc");
		StringBuffer sb2=new StringBuffer("abdce");
		//���ַ�����׷���ַ���
		sb.append("ddddddddddd");
		sb.append(sb2);
		System.out.println(sb.toString());
		String c="tttt";
		//�����ַ��������±�,û�з���-1
		int a= sb2.indexOf(c,1);
		System.out.println(a);
		//���ַ����в����µ��ַ���
		//sb2.insert(1, c);
		System.out.println(sb2.toString());
		//ʵ���ַ����ķ�ת
		 // sb2.reverse();
		//System.out.println(sb2);
		
		//�ַ����滻
		sb2.replace(1, 3, "fff");
		System.out.println(sb2.toString());
		
	}

}
