package com.overload;

public class Student {
	public String name;
	public String studentID;
	public String mobilePhone;
	protected String major;	//רҵ
	private float gpa;	//gpa=grade point avergeƽ���ɼ�����
	
	public void register() {
		
	}
	
	//���ƽ���ɼ�����
	public float getgpa() {
		return gpa;
	}
	
	//�޸�ƽ���ɼ�����
	public void setgpa() {
		gpa = 23.5f;
	}
	
	public void setInfo(String n, String ID) {
		name = n;
		studentID = ID;
	}
	
	public void setInfo(String n, String ID, String add) {
		name = n;
		studentID = ID;
	}
	
	public void setInfo(float g, String ID) {
		gpa = g;
		studentID = ID;
	}
	
	public void getInfo(float g) {
		System.out.println("ѧ�ţ�" + studentID + "\tƽ���ɼ�������"+ g);
	}
	
	public void getInfo(String add) {
		System.out.println("ѧ�ţ�" + studentID + "\t������" + name + "\t��ַ��" + add);
	}
}
