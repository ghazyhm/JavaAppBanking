package dao.dbMySQL;

import java.util.List;

import dao.IUtilisateurDAO;
import presentation.modele.Utilisateur;

public class UtilisateurDAO implements IUtilisateurDAO {

	@Override
	public List<Utilisateur> findAll() {
		return null;
	}

	@Override
	public Utilisateur findById(Long aLong) {
		return null;
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return null;
	}

	@Override
	public Utilisateur update(Utilisateur utilisateur) {
		return null;
	}

	@Override
	public boolean delete(Long aLong) {
		return false;
	}

	@Override
	public Utilisateur findByLoginAndPass(String login, String pass) {
		return null;
	}
}
