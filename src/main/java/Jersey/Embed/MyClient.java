package Jersey.Embed;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
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

        Invocation.Builder builder = target.request();
        Invocation invocation = builder.buildGet();
        Response response = invocation.invoke();
        MyBean myBean = response.readEntity(MyBean.class);
        System.out.println(myBean.toString());
        response.close();
    }

    public static void main(String[] args){
        test02();
    }
}
