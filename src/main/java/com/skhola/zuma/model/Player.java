package com.skhola.zuma.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(
        name = "player",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"ply_dni"}),
                @UniqueConstraint(columnNames = {"ply_email"})
        }
)
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ply_id")
    private Long id;

    @NotNull(message = "The value cannot be null")
    @Pattern(regexp = "\\d{10}", message = "Must be 10 numbers")
    @Column(name = "ply_dni")
    private String dni;

    @NotNull(message = "The value cannot be null")
    @Size(min = 1, max = 50, message = "The length's size mus be between 1 and 50 characters")
    @Column(name = "ply_name")
    private String name;

    @NotNull(message = "The value cannot be null")
    @Size(min = 1, max = 50, message = "The length's size mus be between 1 and 50 characters")
    @Column(name = "ply_surname")
    private String surname;

    @Temporal(TemporalType.DATE)
    @Past(message = "Birthday must be in the past")
    @Column(name = "ply_birth")
    private Date birth;

    @Pattern(regexp = "[FM]", message = "Just value 'F' or 'M'")
    @Column(name = "ply_gender")
    private String gender;

    @Column(
            name = "ply_active",
            columnDefinition = "BOOLEAN DEFAULT true"
    )
    private boolean active;

    @Column(name = "ply_comments")
    private String comments;

    @Email(message = "Invalid email")
    @Column(name = "ply_email")
    private String email;

    @Column(name = "ply_phone")
    private String phone;

}
