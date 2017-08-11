package com.lop.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lopframework.lop.servlet.AnnotationServiceDispatcher;


/**
 * Unit test for simple App.
 */
public class TestSpringSchema {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContexts.xml");
        AnnotationServiceDispatcher ds = (AnnotationServiceDispatcher) context.getBean("annotationServiceDispatcher");
        ApplicationContext applicationContext = ds.getApplicationContext();
        System.out.println(applicationContext.getId());
    }
}
