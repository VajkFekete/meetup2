/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.apps.oal.ci.cicd.training.rest;

import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author tradvans
 */
public class ApplicationConfig extends ResourceConfig {
    
    public ApplicationConfig() {
        register(HelloWorldResource.class);
    }
}
