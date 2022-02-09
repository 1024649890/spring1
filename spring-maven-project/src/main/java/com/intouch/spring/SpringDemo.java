package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Date now=context.getBean(Date.class);
        DateFormat dateFormat=context.getBean(SimpleDateFormat.class);
        System.out.println("当前时间"+dateFormat.format(now));
    }
}
