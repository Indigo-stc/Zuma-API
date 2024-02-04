package com.skhola.zuma.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "sport",
        uniqueConstraints = @UniqueConstraint(columnNames = {"spt_name"})
)
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spt_id")
    private Long id;

    @NotNull(message = "The value cannot be null")
    @Size(min = 1, max = 50, message = "The length's size mus be between 1 and 50 characters")
    @Column(name = "spt_name")
    private String name;

}
