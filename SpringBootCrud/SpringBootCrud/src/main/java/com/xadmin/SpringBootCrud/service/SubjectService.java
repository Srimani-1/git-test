package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository SubjectRepo;
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects = new ArrayList<>();
		SubjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}
	
	public void addSubject(Subject subject) {
		SubjectRepo.save(subject);
	}

	public void updateSubject(String id, Subject subject) {
		SubjectRepo.save(subject);
		
	}

	public void deleteSubject(String id) {
		SubjectRepo.deleteById(id);
		
	}
}
