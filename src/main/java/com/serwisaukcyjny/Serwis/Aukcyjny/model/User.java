package com.serwisaukcyjny.Serwis.Aukcyjny.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "{com.serwisaukcyjny.Serwis.Aukcyjny.model.User.firstName.NotEmpty}")
    private String firstName;
    @NotEmpty(message = "{com.serwisaukcyjny.Serwis.Aukcyjny.model.User.lastName.NotEmpty}")
    private String lastName;

    @Email(message = "")
    @NotEmpty(message = "{com.serwisaukcyjny.Serwis.Aukcyjny.model.User.email.NotEmpty}")
    private String email;
    @NotEmpty(message = "{com.serwisaukcyjny.Serwis.Aukcyjny.model.User.password.NotEmpty}")
    private String password;
    private LocalDateTime localDateTime;
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;
    @OneToOne
    private Address address;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
    @OneToOne(cascade = CascadeType.ALL)
    private Basket basket;

    public User(Long id, String firstName, String lastName, String email, String password,
                LocalDateTime localDateTime, Address address, AccountType accountType, AccountStatus accountStatus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.localDateTime = localDateTime;
        this.address = address;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
    }

    public User(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(localDateTime, user.localDateTime) &&
                Objects.equals(role, user.role) &&
                Objects.equals(address, user.address) &&
                accountType == user.accountType &&
                accountStatus == user.accountStatus &&
                Objects.equals(basket, user.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, password, localDateTime, role, address, accountType, accountStatus, basket);
    }
}
