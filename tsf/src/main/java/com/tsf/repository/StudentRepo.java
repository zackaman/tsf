package com.tsf.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsf.studentmodel.StudentModel;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Long> {

	
	
}
