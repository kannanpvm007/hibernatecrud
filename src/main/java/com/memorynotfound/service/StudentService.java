package com.memorynotfound.service;

import java.util.List;
import com.memorynotfound.entity.Student;

public interface StudentService {

	public void saveStudentObj(Student studentObj);

	public List<Student> getAllStudents();

	public Student getStudentObj(int theId);

	public void removeStudentObj(int theId);

}