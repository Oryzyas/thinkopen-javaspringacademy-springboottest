package it.thinkopen.orm;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Robertina on 20/03/2017.
 */
@Entity
@Data
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String name;
    @Basic
    private Integer hours;
    @Basic
    private Date date;
    @OneToOne
    private Employee employee;
    @OneToOne
    private Job job;

}
