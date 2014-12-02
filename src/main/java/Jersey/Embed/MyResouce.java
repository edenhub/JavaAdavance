package Jersey.Embed;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

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
    @Produces({"application/xml","text/plain"})
    public MyBean doMyBean() {
        System.out.println("Doing my bean");
        MyBean myBean = new MyBean("adam", 23);


        return myBean;
    }

    @Path("/postBean")
    @POST
    @Consumes({"application/xml","text/plain"})
    public String doPostMyBean(MyBean myBean){
        System.out.println("Do Post MyBean");

        return myBean.getName();
    }

    @Path("/postBean2")
    @POST
    public String doPostMyBean2(MyBean myBean){
        System.out.println("Do post MyBean2");

        return myBean.getName();
    }

//    @GET
////    @Produces("text/plain")
//    @Path("/myBean/{name}/{age}")
//    public MyBean doMyBean(@PathParam("name")String name,@PathParam("age")int age){
//        return new MyBean(name,age);
//    }

    @Path("/jsBean")
    @GET
    @Produces("application/json")
    public MyBean jsonMyBean(){
        System.out.println("In Json MyBean");
        return new MyBean("adam2",22);
    }
}
