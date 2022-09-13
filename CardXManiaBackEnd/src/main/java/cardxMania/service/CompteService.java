package cardxMania.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cardxMania.dao.IDAOCompte;
import cardxMania.exception.CompteException;
import cardxMania.model.Compte;

@Service
public class CompteService {

	

	@Autowired
	private IDAOCompte compteRepo;
	

	public List<Compte> getAll() {
		return compteRepo.findAll();
	}

	public Optional<Compte> getById(Integer id) {
		return compteRepo.findById(id);
	}

	public Compte create(Compte compte) {
		return compteRepo.save(compte);
	}

	public Compte update(Compte compte) {
		return compteRepo.save(compte);
	}

	public void deleteById(Integer id) {
		compteRepo.deleteById(id);
	}
	
//	public void seConnecter(String pseudo,String password) {
//		compteRepo.seConnecter(pseudo, password);
//	}
	
	
}
