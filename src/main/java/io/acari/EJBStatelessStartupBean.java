package io.acari;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.ejb.Stateless;

/**
 * Created by alex on 4/23/17.
 */
@Startup
@Stateless
public class EJBStatelessStartupBean {
    @PostConstruct
    void initialize(){
        System.out.println("EJB Stateless Bean Doing Startup Work!");
    }

    @Override
    public String toString() {
        return "EJBStatelessStartupBean";
    }
}
