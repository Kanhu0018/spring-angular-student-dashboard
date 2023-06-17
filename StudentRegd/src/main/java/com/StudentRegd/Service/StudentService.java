package com.StudentRegd.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentRegd.Entity.Student;
import com.StudentRegd.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public Student registerStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> getStudent() {
		List<Student> student = studentRepo.findAll();
		return student;
	}
	public void deleteStudent(Integer id) {
		studentRepo.deleteById(id);
	}
	public Student updateStudent(Student student) {
		Integer rollNumber = student.getRollNumber();
		Student std = studentRepo.findById(rollNumber).get();
		std.setName(student.getName());
		std.setAddress(student.getAddress());
		std.setPercentage(student.getPercentage());
		return studentRepo.save(std);
		
	}

}
