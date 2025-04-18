package Controllers;

import entities.Donation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.DonationService;

import java.util.List;

@RestController
@RequestMapping("/api/dons")
@CrossOrigin(origins = "*")
public class DonationController {

    @Autowired
    private DonationService donService;

    @PostMapping
    public Donation createDon(@RequestBody Donation donation) {
        return donService.saveDon(donation);
    }

    @GetMapping
    public List<Donation> getAllDons() {
        return donService.getAllDons();
    }

    @GetMapping("/{id}")
    public Donation getDonById(@PathVariable Long id) {
        return donService.getDonById(id);
    }

    @PutMapping("/{id}")
    public Donation updateDon(@PathVariable Long id, @RequestBody Donation donation) {
        return donService.updateDon(id, donation);
    }

    @DeleteMapping("/{id}")
    public void deleteDon(@PathVariable Long id) {
        donService.deleteDon(id);
    }
}
