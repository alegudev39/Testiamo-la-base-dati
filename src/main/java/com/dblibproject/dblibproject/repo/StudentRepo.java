package com.dblibproject.dblibproject.repo;

import com.dblibproject.dblibproject.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends JpaRepository<Student , Long> {
}
