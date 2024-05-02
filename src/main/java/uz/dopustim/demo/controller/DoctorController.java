package uz.dopustim.demo.controller;

import org.springframework.web.bind.annotation.*;
import uz.dopustim.demo.model.Doctor;
import uz.dopustim.demo.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("api/v1/doctor")
public class DoctorController {
    public DoctorController(DoctorService service) {
        this.service = service;
    }

    final private DoctorService service;

    @GetMapping
    public List<Doctor> findAll() {
        return service.findAll();
    }

    @PostMapping("/save")
    public Doctor save(@RequestBody Doctor doctor) {
        return service.save(doctor);
    }

    @GetMapping("find/{id}")
    public Doctor find(@PathVariable Long id) {
        return service.find(id);
    }

    @PutMapping("/update/{id}")
    public Doctor update(@PathVariable Long id, @RequestBody Doctor doctor) {
        return service.update(id, doctor);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id)
    {
        service.delete(id);
    }
}
