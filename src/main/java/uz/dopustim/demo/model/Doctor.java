package uz.dopustim.demo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Doctor {
    private String name;
    private String experience;
    public Doctor(String name, String experience)
    {
        this.name = name;
        this.experience = experience;
    }
}
