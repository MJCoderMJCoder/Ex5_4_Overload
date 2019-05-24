package com.overload;
/*方法重载：一个类中，多个方法有相同的名字，参数（个数、类型）不同*/
public class Overload {

	public static void main(String[] args) {
		Student s1, s2;		//声明s1,s2为Student对象
		s1 = new Student();
		s2 = new Student();		//创建s1,s2；并立即调用构造方法实例化对象
		s1.setInfo("赵强", "20100038", "山西太原");
		s2.setInfo(23.5f, "20100089");
		s2.getInfo(23.5f);
		s1.getInfo("山西太原");	
	}

}
