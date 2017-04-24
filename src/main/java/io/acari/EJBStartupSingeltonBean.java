package io.acari;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Created by alex on 4/23/17.
 */
@Startup
@Lock(LockType.READ)
@Singleton
public class EJBStartupSingeltonBean {
    @PostConstruct
    void initialize(){
        System.out.println("EJB Singleton Bean Doing Startup Work!");
    }

    @Override
    public String toString() {
        return "EJBStartupSingeltonBean";
    }
}
