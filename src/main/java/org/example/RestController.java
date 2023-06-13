package org.example;

import javax.ws.rs.*;

@Path("/sayHello")
public class RestController {

    @GET
    @Produces(value = "text/plain")
    public String sayHello(){
        return "Hello from JAX-RS";
    }


    @GET
    @Path("{firstName}/{lastName}")
    @Produces(value = "text/plain")
    public String sayHello2(@PathParam(value = "firstName") String firstName ,@PathParam(value = "lastName") String lastName )
    {
        return "Hello from JAX-RS "+ firstName + " "+ lastName;
    }

    @GET()
    @Path("query")
    @Produces(value = "text/plain")
    public String sayHello3(@QueryParam(value = "firstName") String firstName , @QueryParam(value = "lastName") String lastName )
    {
        return "Hello from JAX-RS "+ firstName + " "+ lastName;
    }
}
