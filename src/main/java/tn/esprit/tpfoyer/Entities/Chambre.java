package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = false)
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Chambre {
    @Id
    @GeneratedValue
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Setter(AccessLevel.NONE)
    long idChambre ;
    long numeroChambre ;
    @Enumerated(EnumType.STRING)
    TypeChambre typeC;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Reservation> reservations;
    @ManyToOne(cascade = CascadeType.ALL)
    Bloc bloc;
}

