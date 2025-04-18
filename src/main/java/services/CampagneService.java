package services;

import entities.Campagne;

import java.util.List;

public interface CampagneService {
    Campagne saveCampagne(Campagne campagne);
    List<Campagne> getAllCampagnes();
    Campagne getCampagneById(Long id);
    Campagne updateCampagne(Long id, Campagne campagne);
    void deleteCampagne(Long id);
}
