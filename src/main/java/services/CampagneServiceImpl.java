package services;

import entities.Campagne;
import repositories.CampagneJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CampagneServiceImpl implements CampagneService {

    private final CampagneJPA campagneJPA;

    @Autowired
    public CampagneServiceImpl(CampagneJPA campagneRepository) {
        this.campagneJPA = campagneRepository;
    }

    @Override
    public Campagne saveCampagne(Campagne campagne) {
        return campagneJPA.save(campagne);
    }

    @Override
    public List<Campagne> getAllCampagnes() {
        return campagneJPA.findAll();
    }

    @Override
    public Campagne getCampagneById(Long id) {
        return campagneJPA.findById(id).orElse(null);
    }

    @Override
    public Campagne updateCampagne(Long id, Campagne campagne) {
        return campagneJPA.findById(id)
                .map(existing -> {
                    existing.setNom(campagne.getNom());
                    existing.setObjectifMontant(campagne.getObjectifMontant());
                    existing.setDateDebut(campagne.getDateDebut());
                    existing.setDateFin(campagne.getDateFin());
                    return campagneJPA.save(existing);
                })
                .orElse(null);
    }

    @Override
    public void deleteCampagne(Long id) {
        campagneJPA.deleteById(id);
    }
}