package io.acari;

import javax.ejb.Startup;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by alex on 4/23/17.
 */
public class StartupExtension implements Extension {

    private final Set<Bean<?>> startupBeanSet = new LinkedHashSet<>();

    <T> void processBeanEvent(@Observes ProcessBean<T> processBeanEvent){
        if(processBeanEvent.getAnnotated().isAnnotationPresent(Startup.class)){
            startupBeanSet.add(processBeanEvent.getBean());
        }
    }

    void afterDeploymentValidation(@Observes AfterDeploymentValidation afterDeploymentValidationEvent,
                                       BeanManager beanManager)   {
        startupBeanSet.forEach(bean -> {
            Object startupBeanReference = beanManager.getReference(bean,
                    bean.getBeanClass(),
                    beanManager.createCreationalContext(bean));
            System.out.println(startupBeanReference.toString() + " is eager to get to work!");
        });
    }
}
