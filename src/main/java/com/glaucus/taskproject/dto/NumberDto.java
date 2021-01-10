package com.glaucus.taskproject.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Bilal_Ahmad
 *
 */


@Entity
@Table(name = "NUMBERTAB1")
public class NumberDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "REQUEST")
	private int request;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getRequest() {
		return request;
	}
	public void setRequest(int request) {
		this.request = request;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + request;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberDto other = (NumberDto) obj;
		if (id != other.id)
			return false;
		if (request != other.request)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NumberDto [id=" + id + ", request=" + request + "]";
	}
	

}