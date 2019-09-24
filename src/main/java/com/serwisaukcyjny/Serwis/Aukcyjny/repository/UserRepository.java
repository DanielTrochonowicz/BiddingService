package com.serwisaukcyjny.Serwis.Aukcyjny.repository;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String login);
}
