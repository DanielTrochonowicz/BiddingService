package com.serwisaukcyjny.Serwis.Aukcyjny.service.impl;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.Role;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.User;
import com.serwisaukcyjny.Serwis.Aukcyjny.repository.RoleRepository;
import com.serwisaukcyjny.Serwis.Aukcyjny.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public void save(User user){
        Role role = roleRepository.getByRole("user");
        user.setRole(role);
        PasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}
