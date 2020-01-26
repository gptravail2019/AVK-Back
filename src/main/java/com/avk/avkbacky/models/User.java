package com.avk.avkbacky.models;

import org.hibernate.validator.constraints.UniqueElements;

public class User {
    private String firstName;
    private String lastName;
    @UniqueElements
    private String userName;
    private String password;
    private Role userRole;

}
