package Jersey.Embed;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by adam on 2014/12/2.
 */
public class MyClient {
    private static final String BASE_URL = "http://localhost:8081/myApp";

    public static void test01(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(BASE_URL).path("myResource");

        Response response = target.request().get();
        System.out.println(response.readEntity(String.class));
        response.close();
    }

    public static void test02(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(BASE_URL).path("myResource").path("myBean");

        Invocation.Builder builder = target.request(MediaType.APPLICATION_XML);
        Invocation invocation = builder.buildGet();
        Response response = invocation.invoke();
        String xmlBean = response.readEntity(String.class);
        System.out.println(xmlBean);
        System.out.println("Done");
        response.close();
    }

    public static void test03(){
        Client client = ClientBuilder.newClient();
        final MyBean myBean = new MyBean("jack",11);
        WebTarget target = client.target(BASE_URL).path("myResource").path("postBean");

        Response response = target.request(MediaType.APPLICATION_XML).post(Entity.entity(myBean,MediaType.APPLICATION_XML));

        System.out.println(response.getStatus());
        System.out.println(response.readEntity(String.class));

        response.close();
    }

    public static void test05(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(BASE_URL).path("myResource").path("jsBean");
        Invocation.Builder builder = target.request();
        Invocation invocation = builder.buildGet();
        Response response = invocation.invoke();
        String result = response.readEntity(String.class);
        System.out.println(result);
        response.close();
        System.out.println("Done");
    }

//    public static void test04(){
//        Client client = ClientBuilder.newClient();
//        final MyBean myBean = new MyBean("jack",11);
//        WebTarget target = client.target(BASE_URL).path("myResource").path("postBean2");
//
//        Response response = target.request().post(Entity.entity(myBean,MediaType.TEXT_PLAIN));
//
//        System.out.println(response.getStatus());
//        System.out.println(response.readEntity(String.class));
//
//        response.close();
//    }

    public static void main(String[] args){
        test02();
    }
}
