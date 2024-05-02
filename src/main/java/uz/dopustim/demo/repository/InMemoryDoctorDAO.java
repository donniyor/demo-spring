package uz.dopustim.demo.repository;

import org.springframework.stereotype.Repository;
import uz.dopustim.demo.model.Doctor;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDoctorDAO {
    private final List<Doctor> DOCTOR = new ArrayList<>();

    public List<Doctor> findAll() {
        return DOCTOR;
    }

    public Doctor save(Doctor doctor) {
        //todo save
        return doctor;
    }

    public Doctor find(Integer id) {
        //todo find
        return null;
    }

    public Doctor update(Doctor doctor) {
        //todo update
        return null;
    }

    public void delete(Integer id) {
        //todo delete
    }
}
