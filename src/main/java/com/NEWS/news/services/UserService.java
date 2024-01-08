package com.NEWS.news.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.NEWS.Exceptions.MyException;

import org.springframework.security.core.userdetails.User;
import com.NEWS.enums.Rol;
import com.NEWS.news.Entities.UserApp;
import com.NEWS.news.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void newUser(String email, String name, String password) throws MyException {

        validate(email, name, password);
        UserApp user = new UserApp();
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);
        user.setRol(Rol.USER);

        userRepository.save(user);

    }

    private void validate(String email, String name, String password) throws MyException {
        if (email.isBlank()) {
            throw new MyException("El email debe estar completo");
        }
        if (name.isBlank()) {
            throw new MyException("El nombre debe estar completo");
        }
        if (password.isBlank() || password == null) {
            throw new MyException("La contraseña no puede estar vacia");
        }
        if (!password.equals(password)) {
            throw new MyException("Las contraseñas deben ser iguales");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UserApp user = userRepository.searchByEmail(email);

        if (user != null) {
            List<GrantedAuthority> auth = new ArrayList<>();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + user.getRol().toString());
            auth.add(p);
            return new User(user.getEmail(), user.getPassword(), auth);
        } else {
            return null;
        }

    }

}
