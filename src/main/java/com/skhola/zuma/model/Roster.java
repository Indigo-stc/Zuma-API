package com.skhola.zuma.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "roster")
public class Roster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rst_id")
    private Long id;

    @Column(
            name = "rst_active",
            columnDefinition = "BOOLEAN DEFAULT true"
    )
    private boolean active;

    // Foreign key
    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "rst_tam_id",
            referencedColumnName = "tam_id"
    )
    private Team team;

    @ManyToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "rst_ply_id",
            referencedColumnName = "ply_id"
    )
    private Player player;

}
