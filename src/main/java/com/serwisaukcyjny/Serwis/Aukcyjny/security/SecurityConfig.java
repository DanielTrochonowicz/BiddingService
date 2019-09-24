package com.serwisaukcyjny.Serwis.Aukcyjny.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Controller;
import javax.sql.DataSource;

@Controller
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        auth.jdbcAuthentication()
                .usersByUsernameQuery("SELECT email, password, 1 FROM user WHERE email=?")
                .authoritiesByUsernameQuery("SELECT u.email, r.role FROM user u inner join role r " +
                        "on r.id=u.role_id WHERE u.email=?")
                .dataSource(dataSource)
                .passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception { http
            .authorizeRequests()
                .antMatchers("/panel-basket").authenticated()
//                .antMatchers("/admin/**").authenticated()
//                .antMatchers("/user/**", "/user").authenticated()
            .anyRequest().permitAll()
            .and()
            .formLogin()
            .loginPage("/logowanie")
            .defaultSuccessUrl("/")
            .usernameParameter("email")
            .passwordParameter("password")
            .and()
            .rememberMe().key("abd")
//            .rememberMe().key(UUID.randomUUID().toString())
            .and()
            .logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/");
    }
}
