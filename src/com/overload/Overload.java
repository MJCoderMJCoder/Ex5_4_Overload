package com.overload;
/*�������أ�һ�����У������������ͬ�����֣����������������ͣ���ͬ*/
public class Overload {

	public static void main(String[] args) {
		Student s1, s2;		//����s1,s2ΪStudent����
		s1 = new Student();
		s2 = new Student();		//����s1,s2�����������ù��췽��ʵ��������
		s1.setInfo("��ǿ", "20100038", "ɽ��̫ԭ");
		s2.setInfo(23.5f, "20100089");
		s2.getInfo(23.5f);
		s1.getInfo("ɽ��̫ԭ");	
	}

}
