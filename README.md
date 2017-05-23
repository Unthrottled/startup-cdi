# Startup Context Dependency Injection (CDI)

---

Are you in charge of developing or maintaining a stateful web application with the Java EE API? 
Do you want some set of events to be triggered on your appliactions startup and shutdown? 
If you answered yes to any of these questions, then this example  should help!

---

To run the sample you will need:
 - Internet Connection (At least the first time it is run)
 - [Java 8 runtime](http://blog.acari.io/jvm/2017/05/05/Gradle-Install.html)
 - [Maven 3.x.x](https://www.mkyong.com/maven/how-to-install-maven-in-windows/) or you could use [SDKMAN](http://sdkman.io/) and enter the following command
    
        sdk install maven
    
  _Boom!_ Done!
 
 All you have to do:
 1. Open a command line. 
 2. Make current working directory the root of the startup-cdi repository.
 
 3.Run the command:
 
    mvn wildfly-swarm:run