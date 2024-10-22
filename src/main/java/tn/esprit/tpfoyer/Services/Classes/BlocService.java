package tn.esprit.tpfoyer.Services.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Bloc;
import tn.esprit.tpfoyer.Repository.BlocRepository;
import tn.esprit.tpfoyer.Services.IBlocService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlocService implements IBlocService {


    @Autowired
    BlocRepository blocRepository;


    @Override
    public List<Bloc> readAll() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc readById(Long id) {
        return blocRepository.findById(id).orElse(new Bloc());
    }

    @Override
    public Bloc create(Bloc bloc) {
     return blocRepository.save(bloc);
    }

    @Override
    public Bloc update(Bloc bloc) {
       return blocRepository.save(bloc);
    }

    @Override
    public String delete(Long id) {
        if (blocRepository.existsById(id)){
            blocRepository.deleteById(id);
            return "Entité supprimé avec succées";
        }else
            return "Entité n'existe pas";
    }
}
