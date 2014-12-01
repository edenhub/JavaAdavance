package Jersey.Embed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
}
