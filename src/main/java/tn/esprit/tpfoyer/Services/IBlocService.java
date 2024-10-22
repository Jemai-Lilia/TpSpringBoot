package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entities.Bloc;
import java.util.List;

public interface IBlocService {

    List<Bloc> readAll();

    Bloc readById(Long id);

    Bloc create(Bloc bloc);

    Bloc update(Bloc bloc);

    String delete(Long id);
}
