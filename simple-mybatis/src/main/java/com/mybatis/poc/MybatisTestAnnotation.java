package com.mybatis.poc;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTestAnnotation {

	public static void main(String args[]) throws IOException {

		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		session.getConfiguration().addMapper(Student_mapper.class);

		Student_mapper mapper = session.getMapper(Student_mapper.class);

		// Create a new student object
		Student student = new Student();

		// Set the values
		student.setId(new BigDecimal(90));
		student.setName("zara");
		student.setBranch("EEE");
		student.setEmail("zara@gmail.com");
		student.setPercentage(new BigDecimal(90));
		student.setPhone(new BigDecimal(123412341L));

		// Insert student data
		mapper.insert(student);
		System.out.println("record inserted successfully");

		student.setName("Zee");
		student.setBranch("Branch");
		student.setEmail("zee@gmail.com");
		mapper.update(student);
		System.out.println("record updated successfully");

		// list student
		List<Student> list = mapper.getAll();
		System.out.println("all: " + list);

		// get by Id
		student = mapper.getById(new BigDecimal(90));
		System.out.println("getById: " + student);

		// delete student
		mapper.delete(new BigDecimal(90));
		System.out.println("record deleted successfully.");

		session.commit();
		session.close();
	}

}
