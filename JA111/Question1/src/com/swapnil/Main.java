package com.swapnil;

public class Main {

	public Object[] changeArray(Object[] arr) {
		Student s1=new Student();
		Employee e1=new Employee();
		String st="";
		int x=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]instanceof Student) {
				Student obj=(Student)arr[i];
				s1=new Student();
				s1.setRoll(obj.getRoll());
				s1.setName(obj.getName());
				int m=obj.getMarks()+10;
				s1.setMarks(m);
			
			}else if(arr[i]instanceof Employee) {
				Employee e2=(Employee)arr[i];
				e1=new Employee();
				e1.setId(e2.getId());
				e1.setName(e2.getName());
				int sa=e2.getSalary()+10000;
				e1.setSalary(sa);
				
			}else if(arr[i] instanceof String) {
				String y=(String)arr[i];
				int l=y.length();
				String bag="";
				for(int j=l-1;j>=0;j--) {
					bag=bag+y.charAt(j);
				}
				st=bag;
			}else if(arr[i]instanceof Integer) {
				x=(int)arr[i]+20;
			}
		}
		Object[] arr1={s1,e1,st,x};
		return arr1 ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] arr={new Student(23,"rakesh",450),new Employee(12,"lokesh",84000),"String",50};
		Main m1=new Main();
		Object[]arr2=m1.changeArray(arr);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
