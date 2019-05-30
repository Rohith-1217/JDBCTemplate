package com.stackoute.springjdbc;

import com.stackoute.springjdbc.config.SpringJdbcConfig;


import com.stackoute.springjdbc.controller.SpringJdbcController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext();
        cxt.register(SpringJdbcConfig.class);
        cxt.refresh();
        SpringJdbcController springJdbcController =(SpringJdbcController) cxt.getBean("springJdbcController");
        System.out.println(springJdbcController.getAll());
        System.out.println(springJdbcController.insert());
        System.out.println(springJdbcController.delete());
        System.out.println(springJdbcController.update());

    }
}