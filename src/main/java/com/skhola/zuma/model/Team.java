package com.skhola.zuma.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "team",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"tam_name"}),
                @UniqueConstraint(columnNames = {"tam_email"})
        }
)
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tam_id")
    private Long id;

    @NotNull(message = "The value cannot be null")
    @Size(min = 1, max = 50, message = "The length's size mus be between 1 and 50 characters")
    @Column(name = "tam_name")
    private String name;

    @Column(
            name = "tam_active",
            columnDefinition = "BOOLEAN DEFAULT true"
    )
    private boolean active;

    @Email(message = "Invalid email")
    @Column(name = "tam_email")
    private String email;

    @NotNull(message = "The value cannot be null")
    @Size(min = 1, max = 120, message = "The length's size mus be between 1 and 50 characters")
    @Column(name = "tam_description")
    private String description;

}
