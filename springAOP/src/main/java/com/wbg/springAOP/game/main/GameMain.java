package com.wbg.springAOP.game.main;

import com.wbg.springAOP.entity.Role;
import com.wbg.springAOP.game.Interceptor;
import com.wbg.springAOP.game.PorxyBeanFactory;
import com.wbg.springAOP.service.RoleService;
import com.wbg.springAOP.service.impl.RoleIntercepotr;
import com.wbg.springAOP.service.impl.RoleServiceImpl;

public class GameMain {
    public static void main(String[] args) {
        RoleService roleService = new RoleServiceImpl();
        Interceptor interceptor = new RoleIntercepotr();
        RoleService proxy =PorxyBeanFactory.getBean(roleService,interceptor);
        Role role = new Role(1,"rolename","男");
        proxy.printRoleInfo(role);
        System.out.println("----------------测试------------");
        role=null;
        proxy.printRoleInfo(role);
    }
}
