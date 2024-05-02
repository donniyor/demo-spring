package uz.dopustim.demo.service;

import uz.dopustim.demo.model.Doctor;
import java.util.List;

public interface DoctorService {
    List<Doctor> findAll();
    Doctor save(Doctor doctor);
    Doctor find(Long id);
    Doctor update(Long id, Doctor doctor);
    void delete(Long id);
}
