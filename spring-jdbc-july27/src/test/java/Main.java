import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.nareshit.dao.StudentDao;
import com.nareshit.model.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		StudentDao dao = (StudentDao)ctx.getBean("dao");
		//Student st = new Student(2, "Hello", "World");
		//dao.saveStudent(st);
		/*
		Student s1 = dao.getStudent(2);
		System.out.println(s1);
		s1.setFirstName("Praveen-1");
		s1.setLastName("Praveen-2");
		dao.updateStudent(s1);
		System.out.println("Student record is successfully updated..");
		*/
		for(Student s : dao.getAllStudents())
			System.out.println(s);
		
		//dao.deleteStudent(1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
