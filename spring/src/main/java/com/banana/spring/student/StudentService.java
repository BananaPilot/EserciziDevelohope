package com.banana.spring.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student getStudent(Long id) {
        return studentRepo.getReferenceById(id);
    }

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        studentRepo.updateStudent(id, student.getNome(), student.getSurname(), student.isWorking());
        return getStudent(id);
    }

    public Student updateIsWorking(Long id) {
        Student student = studentRepo.getReferenceById(id);
        student.setIsWorking(!student.isWorking());
        return studentRepo.save(student);
    }

    public Student deleteStudent(Long id) {
        Student student = studentRepo.getReferenceById(id);
        studentRepo.deleteById(id);
        return student;
    }
}
