/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.apps.oal.ci.cicd.training.app;

import java.io.IOException;
import java.net.URI;
import oracle.apps.oal.ci.cicd.training.rest.ApplicationConfig;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;

/**
 *
 * @author tradvans
 */
public class Main {
    
    public static final String PROTOCOL = "http";
    public static final String CONTEXT_ROOT_RESOURCES = "/cicd/resources";
 
    public static void main(String[] args) throws IOException {
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(URI.create(getBaseURI()), new ApplicationConfig());
        server.start();
         
    }
 
    private static String getBaseURI() {
        String host = System.getProperty("server.host");
        String port = System.getProperty("server.port");
 
        return new StringBuilder()
                .append(PROTOCOL).append("://").append(host).append(":").append(port).append("/").append(CONTEXT_ROOT_RESOURCES)
                .toString();
    }
}
