package com.example.spring.api.Aclass;

import com.example.spring.api.student.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;

    @ManyToMany
    @JoinTable(name = "enrollment", joinColumns = @JoinColumn(name = "s_id"), inverseJoinColumns = @JoinColumn(name = "c_id"))
    private Set<Classe> enrollment;
}
