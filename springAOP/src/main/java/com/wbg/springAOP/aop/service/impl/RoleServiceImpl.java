package com.wbg.springAOP.aop.service.impl;

import com.wbg.springAOP.aop.service.RoleService;
import com.wbg.springAOP.entity.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRoleInfo(Role role, int sort) {
        System.out.println("id = "+role.getId()+", roleName = '"+role.getId()+"', note = '"+role.getNote()+"'");
    }

}
