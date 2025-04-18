package Controllers;


import entities.Campagne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CampagneService;

import java.util.List;

@RestController
@RequestMapping("/api/campagnes")
@CrossOrigin(origins = "*")
public class CampagneController {

    @Autowired
    private CampagneService campagneService;

    @PostMapping
    public Campagne createCampagne(@RequestBody Campagne campagne) {
        return campagneService.saveCampagne(campagne);
    }

    @GetMapping
    public List<Campagne> getAllCampagnes() {
        return campagneService.getAllCampagnes();
    }

    @GetMapping("/{id}")
    public Campagne getCampagneById(@PathVariable Long id) {
        return campagneService.getCampagneById(id);
    }

    @PutMapping("/{id}")
    public Campagne updateCampagne(@PathVariable Long id, @RequestBody Campagne campagne) {
        return campagneService.updateCampagne(id, campagne);
    }

    @DeleteMapping("/{id}")
    public void deleteCampagne(@PathVariable Long id) {
        campagneService.deleteCampagne(id);
    }
}