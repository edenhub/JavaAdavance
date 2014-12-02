package TestJersey.Embed;

import Jersey.Embed.NewBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by lab on 14-12-2.
 */
public class TestNewBean{
    private Client client = ClientBuilder.newClient();
    public static final String Base_Uri = "http://localhost:8081/myApp";
    public static final String ROOT_NAME = "newRe";

    @After
    public void afterClass(){
        System.out.println("Done");
    }

    @Test
    public void testText(){
        final String PATH_NAME = "getText";
        WebTarget webTarget = client.target(Base_Uri).path(ROOT_NAME).path(PATH_NAME);

        Response response = webTarget.request().get();
        String text = response.readEntity(String.class);
        System.out.println(text);
        response.close();
    }

    @Test
    public void testXml(){
        final String PATH_NAME = "getXml";
        WebTarget webTarget = client.target(Base_Uri).path(ROOT_NAME).path(PATH_NAME);

        Response response = webTarget.request().get();
        String text = response.readEntity(String.class);
        System.out.println(text);
        response.close();
    }

    @Test
    public void testNewXml(){
        final String PATH_NAME = "newXml";
        WebTarget webTarget = client.target(Base_Uri).path(ROOT_NAME).path(PATH_NAME);

        Response response = webTarget.request(MediaType.APPLICATION_XML).post(Entity.entity(new NewBean("kk",23),MediaType.APPLICATION_XML));
        String text = response.readEntity(String.class);
        System.out.println(text);
        response.close();
    }

    @Test
    public void testJson(){
        final String PATH_NAME = "getJson";
        WebTarget webTarget = client.target(Base_Uri).path(ROOT_NAME).path(PATH_NAME);

        Response response = webTarget.request().get();
        String text = response.readEntity(String.class);
        System.out.println(text);
        response.close();
    }

    @Test
    public void testServlet(){
        final String PATH_NAME = "js";
        WebTarget webTarget = client.target(Base_Uri).path(PATH_NAME);

        Response response = webTarget.request().get();
        String text = response.readEntity(String.class);
        System.out.println(text);
        response.close();
    }


}
