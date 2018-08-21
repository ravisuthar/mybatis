package com.mybatis.poc;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface Student_mapper {
	
	   final String getAll = "SELECT * FROM STUDENT"; 
	   final String getById = "SELECT * FROM STUDENT WHERE ID = #{id}";
	   final String deleteById = "DELETE from STUDENT WHERE ID = #{id}";
	   final String insert = "INSERT INTO STUDENT (ID, NAME, BRANCH, PERCENTAGE, PHONE, EMAIL ) VALUES (#{id}, #{name}, #{branch}, #{percentage}, #{phone}, #{email})";
	   final String update = "UPDATE STUDENT SET EMAIL = #{email}, NAME = #{name}, BRANCH = #{branch}, PERCENTAGE = #{percentage}, PHONE = #{phone} WHERE ID = #{id}";
	   
	   @Select(getAll)
	   @Results(value = {
	      @Result(property = "id", column = "ID"),
	      @Result(property = "name", column = "NAME"),
	      @Result(property = "branch", column = "BRANCH"),
	      @Result(property = "percentage", column = "PERCENTAGE"),       
	      @Result(property = "phone", column = "PHONE"),
	      @Result(property = "email", column = "EMAIL")
	   })
	   
	   List<Student> getAll();
	  
	   @Select(getById)
	   @Results(value = {
	      @Result(property = "id", column = "ID"),
	      @Result(property = "name", column = "NAME"),
	      @Result(property = "branch", column = "BRANCH"),
	      @Result(property = "percentage", column = "PERCENTAGE"),       
	      @Result(property = "phone", column = "PHONE"),
	      @Result(property = "email", column = "EMAIL")
	   })
	   
	   Student getById(BigDecimal id);

	   @Update(update)
	   void update(Student student);

	   @Delete(deleteById)
	   void delete(BigDecimal id);
	  
	   @Insert(insert)
	   @Options(keyProperty = "id")
	   void insert(Student student);
	}