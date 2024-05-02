package uz.dopustim.demo.service.impl;

import org.springframework.stereotype.Service;
import uz.dopustim.demo.model.Doctor;
import uz.dopustim.demo.repository.DoctorDAO;
import uz.dopustim.demo.service.DoctorService;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorDAO repository;

    public DoctorServiceImpl(DoctorDAO repository) {
        this.repository = repository;
    }

    @Override
    public List<Doctor> findAll() {
        return repository.findAll();
    }

    @Override
    public Doctor save(Doctor doctor) {
        return repository.save(doctor);
    }

    @Override
    public Doctor find(Integer id) {
        return repository.find(id);
    }

    @Override
    public Doctor update(Doctor doctor) {
        return repository.update(doctor);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }
}
