package com.qhit.a;

public class Demo3 {
	
	
	public static void main(String[] args) {
		
		String s="ysbc";
		String ss="abcdefc";
	
		
		
		
		
		//��ȡ�±��Ӧ��ĸ ���ص�����ĸ
	    char a=  s.charAt(0);	
		//���ַ��Ƿ���ͬ ��ͬ����true,���򷵻�false
		if(s.equals(ss)){
			System.out.println("dddd");
		}else{
			System.out.println("ccccccc");
		}
		 
		//��ȡ��ĸ�����ַ�����������±�λ��
		int c=   ss.indexOf("1");
		System.out.println(c);
		//��ȡ��ĸ�����ַ��������ұ��±�λ��
		int d=   ss.lastIndexOf("c");
		
		//�ַ����Ľ�ȡ ����ͷ ������β
		String f=  ss.substring(2,4);
		System.out.println(f);
		
		//ȥ�մ���,ֻ�ܴ���ǰ��ո�
		System.out.println(ss.trim());
		
		//ʹ�ÿո��ȡ�ַ���
		//{"a","bc","defc"}  
		String[] w= ss.split(" ");
		
		String g="";
		for (int i = 0; i < w.length; i++) {
			
			g=g+w[i];
		}
		
		System.out.println(g);
		//����ַ����Ƿ���������ַ�,�����������true���߷���false
		boolean  p=  ss.contains("k");
		
		System.out.println(p);
		//�ַ�������
		System.out.println(s.length());
		
	}
	
	

}
