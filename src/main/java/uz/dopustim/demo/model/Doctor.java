package uz.dopustim.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "doctors")
@Setter
@Getter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "experience")
    private String experience;

    public Doctor() {
    }

    @SuppressWarnings("unused")
    public Doctor(String name, String experience) {
        this.name = name;
        this.experience = experience;
    }
}
