package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.Attendance;

public class ClientDemo {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("applicationcontext.xml");

		
		Attendance a=(Attendance) context.getBean("ragav");
		System.out.println(a.getAttendenceSheet());
	}

}
