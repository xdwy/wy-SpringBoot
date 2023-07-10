package org.springboot;

/**
 * @author zhangmin
 * @create 2023-07-10 15:32
 */
public class TomcatWebServer implements WebServer {

    @Override
    public void start() {
        System.out.println("启动Tomcat程序");
    }
}
