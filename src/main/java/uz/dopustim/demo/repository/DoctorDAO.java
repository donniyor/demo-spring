package uz.dopustim.demo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import uz.dopustim.demo.model.Doctor;

import java.util.List;

@Repository
@Transactional
public class DoctorDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Doctor> findAll() {
        return entityManager.createQuery("SELECT d FROM Doctor d", Doctor.class).getResultList();
    }

    public Doctor save(Doctor doctor) {
        entityManager.persist(doctor);
        return doctor;
    }

    public Doctor find(Long id) {
        return entityManager.find(Doctor.class, id);
    }

    public Doctor update(Long id, Doctor doctor) {
        Doctor entity = find(id);
        if (entity != null) {
            entity.setName(doctor.getName());
            entity.setExperience(doctor.getExperience());
            entityManager.merge(entity);
            return entity;
        }
        return null;
    }

    public void delete(Long id) {
        Doctor doctor = entityManager.find(Doctor.class, id);
        if (doctor != null) {
            entityManager.remove(doctor);
        }
    }
}
