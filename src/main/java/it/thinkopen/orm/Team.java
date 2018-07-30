package it.thinkopen.orm;

import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Basic
    @NotEmpty
    @OneToMany
    private Set<Employee> employees;

    @Basic
    @NotNull
    @OneToOne
    private Project project;
}
