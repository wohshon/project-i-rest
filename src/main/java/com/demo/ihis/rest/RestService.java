package com.demo.ihis.rest;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@WebService

public interface RestService {


	   @GET
	   @Path("/greet/{name}")
	   @Produces(MediaType.APPLICATION_JSON)
	public Response jsonInput(@PathParam(value = "name") String type);

	   
	   @POST
	   @Path("/input")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response input(String input);	   
}
