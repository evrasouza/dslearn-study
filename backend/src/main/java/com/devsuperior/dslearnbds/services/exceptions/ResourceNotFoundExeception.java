package com.devsuperior.dslearnbds.services.exceptions;

public class ResourceNotFoundExeception extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExeception (String msg) {
		super(msg);
	}
	
}
