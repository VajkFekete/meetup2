/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.apps.oal.ci.cicd.training.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author tradvans
 */
@Path("/helloworld")
public class HelloWorldResource {
    @GET
    public String shoot() {
        return "Hello World!!!!";
    }
}
