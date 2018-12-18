package com.wbg.springAOP.aop;

import com.wbg.springAOP.aop.config.AopConfig;
import com.wbg.springAOP.aop.service.RoleService;
import com.wbg.springAOP.aop.service.RoleVerifier;
import com.wbg.springAOP.entity.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("aspectj.xml");
        RoleService roleService = ctx.getBean(RoleService.class);
        RoleVerifier roleVerifier = (RoleVerifier) roleService;
        Role role = new Role(1,"123","55");
        if(roleVerifier.verify(role))
        roleService.printRoleInfo(role, 1);
        System.out.println("--------------");
        role=null;
        if(roleVerifier.verify(role))
        roleService.printRoleInfo(role,1);
    }
}
