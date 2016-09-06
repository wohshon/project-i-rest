package com.demo.ihis.rest;

import javax.ws.rs.core.Response;


public class RestServiceImpl implements RestService {

	@Override
	public Response jsonInput(String type) {
		return Response.ok("Hi there "+ type).build();	
	}

	@Override
	public Response input(String input) {
		// TODO Auto-generated method stub
		return null;
	}
}
