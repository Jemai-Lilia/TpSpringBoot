package tn.esprit.tpfoyer.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString(includeFieldNames = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE )
@EqualsAndHashCode
public class Etudiant {
    @Id
    @GeneratedValue
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Setter(AccessLevel.NONE)
    long idEtudiant;
    String nomEt;
    String prenomEt;
    long cin;
    String ecole;
    Date dateNaissance;
    @ManyToMany(mappedBy = "etudiants")
    Set<Reservation> reservations;




}