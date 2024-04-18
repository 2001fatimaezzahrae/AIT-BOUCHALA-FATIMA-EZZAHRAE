package ma.fac.hospital.services;

import ma.fac.hospital.entities.Consultation;
import ma.fac.hospital.entities.Medecin;
import ma.fac.hospital.entities.Patient;
import ma.fac.hospital.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
