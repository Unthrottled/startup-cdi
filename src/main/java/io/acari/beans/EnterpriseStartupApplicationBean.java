package io.acari.beans;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

/**
 * Created by alex on 4/23/17.
 */
@Startup
@ApplicationScoped
public class EnterpriseStartupApplicationBean {

    @PostConstruct
    void initialize(){
        System.out.println("Application Bean Doing Startup Work!");
    }

    @Override
    public String toString() {
        return "EnterpriseStartupApplicationBean";
    }
}
