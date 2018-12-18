package com.wbg.springAOP.aop.aspect;

import com.wbg.springAOP.aop.service.RoleVerifier;
import com.wbg.springAOP.aop.service.impl.RoleVerifierImpl;
import com.wbg.springAOP.entity.Role;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class RoleAspect {

    @DeclareParents(value = "com.wbg.springAOP.aop.service.impl.RoleServiceImpl+",defaultImpl = RoleVerifierImpl.class)
    public RoleVerifier roleVerifier;


    @Pointcut("execution(* com.wbg.springAOP.aop.service.impl.RoleServiceImpl.printRoleInfo(..))")
    public void print() {

    }

    @Before("execution(* com.wbg.springAOP.aop.service.impl.RoleServiceImpl.printRoleInfo(..)) && args(role, sort)")
    public void before(Role role ,int sort) {
         System.out.println("进入方法before...");
    }


    @After("print()")
    public void after() {
        System.out.println("进入方法after...");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("进入方法afterReturning...");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

    @Around("print()")
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("around======before============");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around======after============");
    }

}
