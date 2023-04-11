//package com.apress.myblog.configs;
//
//import lombok.extern.log4j.Log4j2;
//import org.apache.catalina.Context;
//import org.apache.catalina.connector.Connector;
//import org.apache.tomcat.util.descriptor.web.SecurityCollection;
//import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ConfigurationProperties(prefix = "server")
//@Log4j2
//public class TomcatConfiguration {
//    @Value("${server.port}")
//    private Integer port;
//    @Bean
//    public ServletWebServerFactory servletWebServerFactory(){
//        log.info("the port is {} ",port);
//        TomcatServletWebServerFactory tomcat =
//              new   TomcatServletWebServerFactory(){
//
//                  @Override
//                  protected void postProcessContext(Context context) {
//                      SecurityConstraint securityConstraint = new SecurityConstraint();
//                      securityConstraint.setUserConstraint("CONFIDENTIAL");
//                      SecurityCollection collection = new SecurityCollection();
//                      collection.addPattern("/*");
//                      securityConstraint.addCollection(collection);
//                      context.addConstraint(securityConstraint);
//                  }
//              };
//        tomcat.addAdditionalTomcatConnectors(initiateHttpConnector());
//        return tomcat;
//    }
//
//    private Connector initiateHttpConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(8080);
//        connector.setSecure(false);
//        connector.setRedirectPort(port);
//        return connector;
//    }
//
//}
