package com.neusoft.$temp.base.extendsOrder;

public  class Parent {
	int test_file=1;
	int test_file1=2;
	public static int age;
	public String name;
	static {
		System.out.println("����ľ�̬����� age:"+age);
		age = 10;
	}
	{
		System.out.println("�����ʵ�������name:"+name);
		name ="xiaoming";
	}
	public Parent() {
		System.out.println("���๹����age:"+age);
		age =20;
	}
	public void test() {
		System.out.println("����name:"+name+" "+"age:"+age);
	}
	

	@Override
	public String toString() {
		return "Parent [name=" + name + "age=" + age + "]";
	}
	public void test2() {
		test();
	}

}
