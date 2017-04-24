package io.acari;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Startup;
import javax.inject.Singleton;

/**
 * Created by alex on 4/23/17.
 */
@Startup
@Singleton
@Lock(LockType.READ)
public class EnterpriseSingletonStartupBean {
    @PostConstruct
    void initialize(){
        System.out.println("Enterprise Startup Bean Doing Startup Work!");
    }

    @Override
    public String toString() {
        return "EnterpriseSingletonStartupBean";
    }
}
