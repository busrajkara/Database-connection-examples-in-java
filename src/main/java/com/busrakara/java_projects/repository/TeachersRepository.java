package com.busrakara.java_projects.repository;

import com.busrakara.java_projects.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends JpaRepository<Teachers, Long> {
}
/// Burada sadece öğrenci isminin yerine öğretmen yazdım