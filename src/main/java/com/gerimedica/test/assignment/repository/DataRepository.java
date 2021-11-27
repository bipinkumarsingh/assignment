package com.gerimedica.test.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerimedica.test.assignment.model.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, String> {

	Data findByCode(String code);
}
