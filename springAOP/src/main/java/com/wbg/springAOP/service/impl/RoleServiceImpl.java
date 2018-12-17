package com.wbg.springAOP.service.impl;

import com.wbg.springAOP.entity.Role;
import com.wbg.springAOP.service.RoleService;

public class RoleServiceImpl implements RoleService {
    @Override
    public void printRoleInfo(Role role) {
        System.out.println("id = "+role.getId()+", roleName = '"+role.getId()+"', note = '"+role.getNote()+"'");
    }
}
