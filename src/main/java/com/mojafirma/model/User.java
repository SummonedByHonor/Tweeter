package com.mojafirma.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private long userId;

    @Column (name = "name")
    private String userName;

    @Column (name = "password")
    private String userPassword;
}
