package com.gerimedica.test.assignment.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.gerimedica.test.assignment.model.Data;
import com.gerimedica.test.assignment.repository.DataRepository;
import com.gerimedica.test.assignment.util.CSVUtil;

@Service
public class AssignmentService {
	
	@Autowired
	DataRepository repository;

	@Transactional
	public void save(MultipartFile file) {
		try {
			List<Data> tutorials = CSVUtil.csvToData(file.getInputStream());
			repository.saveAll(tutorials);
		} catch (IOException e) {
			throw new RuntimeException("fail to store csv data: " + e.getMessage());
		}
	}

	public List<Data> getAllData() {
		return repository.findAll();
	}

	public Optional<Data> getData(String code) {
        return repository.findById(code);
	}

	public void deleteAllData() {
		repository.deleteAll();
	}
}
