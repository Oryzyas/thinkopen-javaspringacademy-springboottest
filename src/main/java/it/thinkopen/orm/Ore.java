package it.thinkopen.orm;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Biagio Gallucci on 10/07/2017.
 */
@Entity
@Data
public class Ore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Basic
    private String ore;
    @OneToOne
    private MyUser user;
}