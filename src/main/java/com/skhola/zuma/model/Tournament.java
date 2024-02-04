package com.skhola.zuma.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tournament")
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tmt_id")
    private Long id;

    @NotNull(message = "The value cannot be null")
    @Size(min = 1, max = 100, message = "The length's size mus be between 1 and 50 characters")
    @Column(name = "tmt_name")
    private String name;

    @Column(name = "tmt_startDate")
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "tmt_finishDate")
    private Date finishDate;

    // Foreign key
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "tmt_spt_id",
            referencedColumnName = "spt_id"
    )
    private Sport sport;

}
