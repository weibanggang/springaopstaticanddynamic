package com.wbg.springAOP.aop.service.impl;

import com.wbg.springAOP.aop.service.RoleVerifier;
import com.wbg.springAOP.entity.Role;

public class RoleVerifierImpl implements RoleVerifier {
    @Override
    public boolean verify(Role role) {
        return role != null;
    }
}
