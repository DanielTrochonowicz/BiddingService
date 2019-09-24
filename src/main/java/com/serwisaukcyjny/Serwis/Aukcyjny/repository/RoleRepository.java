package com.serwisaukcyjny.Serwis.Aukcyjny.repository;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

        Role getByRole(String role);
}
