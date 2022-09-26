package com.generate;

public class Main {

	public static Person generatePerson(Person person) {
		if(person instanceof Student) {
			Student s=new Student();
			s.name="Swapnil";
			s.gender="Male";
			Address ad=new Address();
			ad.city="Pune";
			ad.PinCode="413520";
			ad.state="Maha";
			s.address=ad;
			s.studentId=101;
			s.courseEnrolled="English";
			s.courseFee=50000;
			return s;
		}else if(person instanceof Instructor){
			Instructor i=new Instructor();
			i.name="Venu";
			i.gender="Male";
			Address ad=new Address();
			ad.city="Pune";
			ad.PinCode="413520";
			ad.state="Maha";
			i.address=ad;
			i.instructorId=101;
			i.salary=500000;
			return i;
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		Person newstudent=generatePerson(new Student());
		System.out.println(newstudent);
	}

}
