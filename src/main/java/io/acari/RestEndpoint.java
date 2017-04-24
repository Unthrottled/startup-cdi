package io.acari;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by alex on 4/24/17.
 */
@Path("/get")
public class RestEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMessage(){
        return "DOES WORK \n";
    }
}
