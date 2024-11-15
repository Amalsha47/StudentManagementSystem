package com.example.StudentManagementSystem.repository;
import com.example.StudentManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface StudentRepository extends JpaRepository<Student,Long> {
 //crud
 List<Student> findByYearOfEnrollment(int YearOfEnrollment);
}