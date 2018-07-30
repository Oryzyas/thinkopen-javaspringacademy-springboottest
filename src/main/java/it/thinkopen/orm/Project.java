package it.thinkopen.orm;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Alessandro Minervini on 20/03/2017.
 */
@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Basic
    private String name;
}
