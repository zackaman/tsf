package com.tsf.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsf.studentmodel.StudentModel;
import com.tsf.repository.StudentRepo;

@RestController
@RequestMapping("/")
public class StudentController {

  StudentModel stud;	
  
  @Autowired
  StudentRepo studrepo;
  
  @GetMapping("/students")
  public List<StudentModel> getAll(){
	  return studrepo.findAll();
  }
  
  
  
	
  @PostMapping("/addStud" )
  public StudentModel getStud(@Valid @RequestBody StudentModel StudM) {
	  return studrepo.save(StudM);
  }
  
  @PutMapping("/upStud/{id}")

  public StudentModel upStud(@PathVariable(value="id")long id,@RequestBody StudentModel studM) {
	StudentModel sm = new StudentModel();
	  sm = studrepo.findById((id)).orElse(new StudentModel());
	  sm.setName(studM.getName());
	  return studrepo.save(sm);
  }
  
  @GetMapping("/stud/{id}")
  public StudentModel getStudone(@PathVariable(value="id")long id) {
	  return studrepo.findById(id).orElse(new StudentModel());
  }
  
  @DeleteMapping("/delStud")
  public void delStud(@Valid @RequestBody StudentModel StudMn) {
	   studrepo.delete(StudMn);
	  }
  
  

  
}
