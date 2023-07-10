package org.springboot;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

/**
 * @author zhangmin
 * @create 2023-07-10 13:37
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ComponentScan
public @interface WySpringBootApplication {

}
