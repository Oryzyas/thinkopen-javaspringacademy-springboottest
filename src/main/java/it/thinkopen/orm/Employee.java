package it.thinkopen.orm;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Robertina on 20/03/2017.
 */
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Basic
    @NotNull
    private String firstname;

    @Basic
    @NotNull
    private String lastname;

    @Basic
    @NotNull
    @Column(unique = true)
    private String username;

    @Basic
    @NotNull
    private String password;
}
