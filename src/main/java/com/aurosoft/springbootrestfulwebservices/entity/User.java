package com.aurosoft.springbootrestfulwebservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "first_name",nullable = false, length = 20)
    private String firstName;
    @Column(name = "last_name" , nullable = false ,length = 20)
    private String lastName;
    @Column(nullable = false, unique = true , length = 50)
    private String email;
}
