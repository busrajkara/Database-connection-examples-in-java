package com.busrakara.java_projects.repository;

import com.busrakara.java_projects.entity.Branches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchesRepository extends JpaRepository<Branches, Long> {

}
