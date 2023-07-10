package org.springboot;

import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.lang.annotation.Annotation;

/**
 * @author zhangmin
 * @create 2023-07-10 13:42
 */
public class WySpringApplication {
    public static void run(Class clazz){
        //创建一个Spring容器
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(clazz);
        applicationContext.refresh();

        //启动Tomcat
        WebServer webServer = getWebServer();
        startTomcat(applicationContext);
    }

    private static WebServer getWebServer(Web) {
        //判断
    }

    private static void startTomcat(WebApplicationContext applicationContext) {
        Tomcat tomcat = new Tomcat();

        Server server = tomcat.getServer();
        Service service = tomcat.getService();

        Connector connector = new Connector();
        connector.setPort(8081);

        Engine engine = new StandardEngine();
        engine.setDefaultHost("localhost");

        Host host = new StandardHost();
        host.setName("localhost");

        String contextPath = "";
        Context context = new StandardContext();

        context.setPath(contextPath);
        context.addLifecycleListener(new Tomcat.FixContextListener());

        host.addChild(context);
        engine.addChild(host);

        service.setContainer(engine);
        service.addConnector(connector);

        tomcat.addServlet(contextPath,"dispatcher",new DispatcherServlet(applicationContext));
        context.addServletMappingDecoded("/*","dispatcher");

        try {
            tomcat.start();
        }catch (LifecycleException e){
            e.printStackTrace();
        }
    }
}
