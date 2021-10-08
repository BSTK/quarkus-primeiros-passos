package dev.bstk;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("/tecnologiasTextPlain")
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> tecnologiasTextPlain() {
        return List.of("Java", ".NET", "NodeJs", "AWS", "Azure");
    }

    @GET
    @Path("/tecnologiasJson")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> tecnologiasJson() {
        return List.of("Java", ".NET", "NodeJs", "AWS", "Azure");
    }

}
