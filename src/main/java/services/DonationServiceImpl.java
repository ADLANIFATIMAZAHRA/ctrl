package services;


import entities.Donation;

import repositories.DonationJPA;

import java.util.List;
import java.util.Optional;

public class DonationServiceImpl implements DonationService {

    private DonationJPA donationJPA;


    public Donation saveDon(Donation don) {
        return donationJPA.save(don);
    }


    public List<Donation> getAllDons() {
        return donationJPA.findAll();
    }


    public Donation getDonById(Long id) {
        return donationJPA.findById(id).orElse(null);
    }


    public Donation updateDon(Long id, Donation don) {
        Optional<Donation> existingDon =  donationJPA.findById(id);
        if (existingDon.isPresent()) {
            Donation updated = existingDon.get();
            updated.setCampagne(don.getCampagne());
            updated.setNomDonateur(don.getNomDonateur());
            updated.setMontant(don.getMontant());
            updated.setDate(don.getDate());
            return donationJPA.save(updated);
        }
        return null;
    }


    public void deleteDon(Long id) {
        donationJPA.deleteById(id);
    }
}
