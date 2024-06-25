package com.afterschool.after_school.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.afterschool.after_school.models.Student;
import com.afterschool.after_school.service_impl.StudentService;

@Component
public class StudentFacade {

    private final StudentService studentService;

    public StudentFacade(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    public Student getStudentById(Long id) {
        return studentService.getStudentById(id);
    }

    public Student createStudent(Student student) {
        return studentService.createStudent(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        return studentService.updateStudent(id, studentDetails);
    }

    public void deleteStudent(Long id) {
        studentService.deleteStudent(id);
    }
}