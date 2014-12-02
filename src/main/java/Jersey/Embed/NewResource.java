package Jersey.Embed;

import javax.ws.rs.*;

/**
 * Created by lab on 14-12-2.
 */

@Path("newRe")
public class NewResource {

    @GET
    @Path("getText")
    @Produces("text/plain")
    public NewBean getText(){
        System.out.println("text");
        return new NewBean("text",11);
    }

    @GET
    @Path("getXml")
    @Produces("application/xml")
    public NewBean getXml(){
        System.out.println("xml");
        return new NewBean("xml",12);
    }

    @GET
    @Path("getJson")
    @Produces("application/json")
    public NewBean getJson(){
        System.out.println("json");
        return new NewBean("json",13);
    }

    @POST
    @Path("newXml")
    @Consumes("application/xml")
    public String newXMl(NewBean newBean){
        System.out.println("New Xml");
        System.out.println(newBean);
        return newBean.getArgName();
    }
}
