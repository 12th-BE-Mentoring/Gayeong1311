package org.example.backendmentoring.domain.student.service;

import org.example.backendmentoring.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    Student student = new Student();
    public Student CreateStudent(int Sn , int phone, String name, int point){
        return this.student;
    }
}
