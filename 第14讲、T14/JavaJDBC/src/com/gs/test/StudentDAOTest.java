package com.gs.test;

import java.util.List;

import org.junit.Test;

import com.gs.bean.Student;
import com.gs.dao.StudentDAO;
import com.gs.dao.StudentDAOImpl;

import junit.framework.TestCase;

public class StudentDAOTest extends TestCase {
	
	private StudentDAO stuDAO;
	
	@Override
	protected void setUp() throws Exception {
		stuDAO = new StudentDAOImpl();
	}

	@Test
	public void testAdd() {
		Student stu = new Student();
		stu.setName("test");
		stu.setAge(30);
		stuDAO.add(stu);
	}
	
	@Test
	public void testUpdate() {
		Student stu = new Student();
		stu.setId(1);
		stu.setName("new name");
		stu.setAge(28);
		stuDAO.update(stu);
	}
	
	@Test
	public void testQueryById() {
		Student stu = stuDAO.queryById(3);
		if (stu != null) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void testQueryAll() {
		List<Student> stus = stuDAO.queryAll();
		for (Student stu : stus) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void testDelete() {
		
	}

}
