package services;

import entities.Donation;

import java.util.List;

public interface DonationService {
    Donation saveDon(Donation don);
    List<Donation> getAllDons();
    Donation getDonById(Long id);
    Donation updateDon(Long id, Donation donation);
    void deleteDon(Long id);
}
