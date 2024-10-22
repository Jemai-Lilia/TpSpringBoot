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
public class Foyer {
    @Id
    @GeneratedValue
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Setter(AccessLevel.NONE)
    long idFoyer;
    String nomFoyer;
    long capaciteFoyer;
    @OneToMany (mappedBy = "foyer")
    Set<Bloc> blocs;
    @OneToOne(mappedBy = "foyer")
    Universite universite;

}
