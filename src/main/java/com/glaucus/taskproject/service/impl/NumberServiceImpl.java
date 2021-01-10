package com.glaucus.taskproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glaucus.taskproject.dto.NumberDto;
import com.glaucus.taskproject.repository.NumberRepository;
import com.glaucus.taskproject.service.NumberService;

@Service
public class NumberServiceImpl implements NumberService {

	@Autowired
	NumberRepository numberRepository1;

	public void executeThread() {

		NumberDto numDto = null;
		List<NumberDto> l = null;
		
		try {
			
			synchronized (this) {
				l = numberRepository1.getData();

				if (!l.isEmpty()) {
					numDto = l.get(0) == null ? null : l.get(0);
				}
				if (numDto == null) {
					numDto = new NumberDto();
					int n = 1;
					numDto.setId(n);
					numDto.setRequest(n);
					numberRepository1.save(numDto);
				} else {
					numDto.setRequest(numDto.getRequest() == 0 ? 1 : numDto.getRequest() + 1);
					numberRepository1.save(numDto);
				}
			}
		} catch (Exception e) {
			System.out.println("Thread intreptted ... !!");
		}

	}

}
