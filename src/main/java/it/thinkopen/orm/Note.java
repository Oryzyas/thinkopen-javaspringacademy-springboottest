package it.thinkopen.orm;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Basic
    @NotNull
    private String content;

    @Basic
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Basic
    @NotNull
    @ManyToOne
    private Employee employee;
}
