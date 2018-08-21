package com.mybatis.poc;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {

	public static void main(String args[]) throws IOException {

		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();

		// Create a new student object
		Student student = new Student(new BigDecimal(1), "Ravi", "It", new BigDecimal(80), new BigDecimal(9848033221L), "ravi@gmail.com");

		// Insert student data
		session.insert("Student.insert", student);
		System.out.println("record inserted successfully.");

		// update student
		student.setName("Ravi Suthar");
		student.setEmail("ravi.suthar@gmail.com");
		student.setPhone(new BigDecimal(9724566699L));
		session.update("Student.update", student);
		System.out.println("record updated successfully.");

		// list student
		List<Student> list = session.selectList("Student.getAll");
		System.out.println("all: " + list);

		// get by Id
		student = session.selectOne("Student.getById", student);
		System.out.println("getById: " + student);

		// delete student
		session.delete("Student.deleteById", 1);
		System.out.println("record deleted successfully.");

		session.commit();
		session.close();

	}
}
