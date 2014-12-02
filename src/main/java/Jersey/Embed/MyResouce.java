package Jersey.Embed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by adam on 14-12-2.
 */

@Path("/myResource")
public class MyResouce {

    @GET
    @Produces("text/plain")
    public String doHold(){
        System.out.println("Doing hold");

        return "finish";
    }

    @GET
//    @Produces("text/plain")
    @Path("/myBean")
    public MyBean doMyBean(){
        System.out.println("Doing my bean");
        return new MyBean("adam",23);
    }

    @GET
//    @Produces("text/plain")
    @Path("/myBean/{name}/{age}")
    public MyBean doMyBean(@PathParam("name")String name,@PathParam("age")int age){
        return new MyBean(name,age);
    }
}
