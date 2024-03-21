package com.example.spring.api.student;


import com.example.spring.api.Aclass.Classe;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String lastName;
    private String firstName;
    private String email;

    @ManyToMany
    @JoinTable(name = "enrollment", joinColumns = @JoinColumn(name = "c_id"), inverseJoinColumns = @JoinColumn(name = "s_id"))
    private Set<Student> enrollment;
}
