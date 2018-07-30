package it.thinkopen.orm;


import lombok.Data;

import javax.persistence.*;

/**
 * Created by Alessandro Minervini on 22/03/2017.
 */

@Entity
@Data
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String name;
    @OneToOne
    private Project project;
}
