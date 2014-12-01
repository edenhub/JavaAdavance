package Jersey.Embed;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.BufferedInputStream;
import java.net.URI;
import java.util.Scanner;

/**
 * Created by adam on 14-12-2.
 */
public class MyServer {

    public static final String Base_Uri = "http://localhost:8081/myApp";

    public static HttpServer startServer(){
        final ResourceConfig resourceConfig = new ResourceConfig().packages("Jersey.Embed");

        return GrizzlyHttpServerFactory.createHttpServer(URI.create(Base_Uri),resourceConfig);
    }

    public static void main(String[] args){
        final HttpServer httpServer = startServer();
        System.out.println("Server had start,type any key to stop...");

        String str = new Scanner(new BufferedInputStream(System.in)).nextLine();

        httpServer.shutdown();

    }
}
