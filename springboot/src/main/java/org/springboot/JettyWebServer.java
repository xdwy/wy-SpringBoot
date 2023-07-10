package org.springboot;

/**
 * @author zhangmin
 * @create 2023-07-10 15:33
 */
public class JettyWebServer implements WebServer{

    @Override
    public void start() {
        System.out.println("启动Jetty程序");
    }
}
