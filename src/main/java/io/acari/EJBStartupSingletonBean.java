package io.acari;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Lock(LockType.READ)
@Singleton
public class EJBStartupSingletonBean {
    @PostConstruct
    void initialize(){
        System.err.println("EJB Singleton Bean Doing Startup Work!");
    }

    @PreDestroy
    void shutdown(){
        System.err.println("EJB Singleton Bean Doing Cleanup Work before shutdown!");
    }
}
