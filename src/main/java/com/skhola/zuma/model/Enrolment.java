package com.skhola.zuma.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "enrolment",
        uniqueConstraints = @UniqueConstraint(columnNames = {"emt_tam_id","emt_tmt_id"})
)
public class Enrolment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emt_id")
    private Long id;

    @NotNull(message = "The value cannot be null")
    @Positive(message = "The value's cost must be bigger than zero")
    @Column(name = "emt_cost")
    private Double cost;

    @Column(
            name = "emt_active",
            columnDefinition = "BOOLEAN DEFAULT false"
    )
    private boolean active;

    @Temporal(TemporalType.DATE)
    @Column(name = "emt_dateEnrolemnt")
    private Date dateEnrolemnt;

    // Foreign Keys

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "emt_tam_id",
            referencedColumnName = "tam_id"
    )
    private Team team;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "emt_tmt_id",
            referencedColumnName = "tmt_id"
    )
    private Tournament tournament;

    // to save the current date of enrolment
    @PrePersist
    public void onDateEnrolment() {
        this.dateEnrolemnt = new Date();
    }

}
