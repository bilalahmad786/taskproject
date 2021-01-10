package com.glaucus.taskproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.glaucus.taskproject.dto.NumberDto;


@Repository
public interface NumberRepository extends CrudRepository<NumberDto, Integer>{

	@Query(" from NumberDto")
	public List<NumberDto> getData();
}
