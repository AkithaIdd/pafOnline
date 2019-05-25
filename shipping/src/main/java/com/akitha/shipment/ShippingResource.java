package com.akitha.shipment;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("ships")
public class ShippingResource {
	
	ShippingRepository repo = new ShippingRepository();
	// get data from db
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Shipping> getShippings() {
		
	
		return repo.getShippings();
	}
	//get data from db using id
	@GET
	@Path("shipment/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Shipping getShipping(@PathParam("id")int id) {
		return repo.getShipping(id);
	}
	
	//insert data into db
	@POST
	@Path("shipment")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Shipping createShipping(Shipping s1) {
		System.out.print(s1);
		repo.create(s1);
		return s1;
	}
	//update inserted data
	@PUT
	@Path("shipment")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Shipping updateShipping(Shipping s1) {
		System.out.print(s1);
		if(repo.getShipping(s1.getId()).getId()==0)
		{
			repo.create(s1);
		}
		else {
			repo.update(s1);
		}
		repo.update(s1);
		return s1;
	}
	// delete inserted data
	@DELETE
	@Path("shipment/{id}")
	public Shipping deleteShipping(@PathParam("id") int id) {
		Shipping s = repo.getShipping(id);
		
		if(s.getId()!=0) 
			repo.delete(id);
		
		return s;
	}
}
