package com.glaucus.taskproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glaucus.taskproject.dto.NumberDto;
import com.glaucus.taskproject.repository.NumberRepository;
import com.glaucus.taskproject.service.NumberService;



/**
 * 
 * @author Bilal_Ahmad
 *
 */


@Service
public class NumberServiceImpl implements NumberService {

	@Autowired
	NumberRepository numberRepository;

	public void executeThread() {

		NumberDto numDto = null;
		List<NumberDto> l = null;
		
		try {			
			synchronized (this) {
				l = (List<NumberDto>) numberRepository.findAll();
				if (!l.isEmpty()) {
					numDto = l.get(0) == null ? null : l.get(0);
				}
				if (numDto == null) {
					numDto = new NumberDto();
					numDto.setId(1);
					numDto.setRequest(1);
				} else {
					numDto.setRequest(numDto.getRequest() == 0 ? 1 : numDto.getRequest() + 1);
				}
				numberRepository.save(numDto);
			}
		} catch (Exception e) {
			System.out.println("Thread intreptted ... !!");
		}
	}

}
