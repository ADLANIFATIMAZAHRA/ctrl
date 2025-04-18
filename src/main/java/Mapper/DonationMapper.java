package Mapper;

import DTO.DonationDTO;
import entities.Donation;
import entities.Campagne;

public class DonationMapper {

        public static Donation DonationDTOtoDonation(DonationDTO dto, Campagne campagne) {
            Donation donation = new Donation();
            donation.setId(dto.getId());
            donation.setCampagne(campagne);
            donation.setNomDonateur(dto.getNomDonateur());
            donation.setMontant(dto.getMontant());

            return donation;
        }

}
