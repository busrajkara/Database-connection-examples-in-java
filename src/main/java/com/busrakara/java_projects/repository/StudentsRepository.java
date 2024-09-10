package com.busrakara.java_projects.repository;

import com.busrakara.java_projects.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

}
