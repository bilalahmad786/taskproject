package com.glaucus.taskproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.glaucus.taskproject.dto.NumberDto;

/**
 * 
 * @author Bilal_Ahmad
 *
 */

@Repository
public interface NumberRepository extends CrudRepository<NumberDto, Integer>{

	
}
