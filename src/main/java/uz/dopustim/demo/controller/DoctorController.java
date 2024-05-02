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
    public Doctor find(@PathVariable Integer id) {
        return service.find(id);
    }

    @PutMapping("/update")
    public Doctor update(@RequestBody Doctor doctor) {
        return service.update(doctor);
    }

    @DeleteMapping("/delete/{name}")
    public void delete(@PathVariable Integer id)
    {
        service.delete(id);
    }
}
