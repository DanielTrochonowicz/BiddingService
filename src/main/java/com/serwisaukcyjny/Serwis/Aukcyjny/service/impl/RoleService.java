package com.serwisaukcyjny.Serwis.Aukcyjny.service.impl;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.Role;
import com.serwisaukcyjny.Serwis.Aukcyjny.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role getByRole(String role){
    return roleRepository.getByRole(role);
    }
}
