package uz.dopustim.demo.service;

import uz.dopustim.demo.model.Doctor;
import java.util.List;

public interface DoctorService {
    List<Doctor> findAll();
    Doctor save(Doctor doctor);
    Doctor find(Integer id);
    Doctor update(Doctor doctor);
    void delete(Integer id);
}
