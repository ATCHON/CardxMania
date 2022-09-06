package cardxMania.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Lot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany(mappedBy = "lot")
	private List<Achat> achats;
	private int note;

	@ManyToOne
	private User acheteur;
	@ManyToOne
	private User vendeur;
	
	@Column(name="date_achat")
	private LocalDate dateAchat;

	
	
	public Lot() {
	}

	
	public Lot(User acheteur, User vendeur, LocalDate dateAchat) {
		super();
		this.acheteur = acheteur;
		this.vendeur = vendeur;
		this.dateAchat = dateAchat;
	}



	public LocalDate getDateAchat() {
		return dateAchat;
	}


	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}


	public int getNote() {
		return note;
	}

	

	public void setNote(int note) {
		this.note = note;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public List<Achat> getAchats() {
		return achats;
	}


	public void setAchats(List<Achat> achats) {
		this.achats = achats;
	}


	public User getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(User acheteur) {
		this.acheteur = acheteur;
	}

	public User getVendeur() {
		return vendeur;
	}

	public void setVendeur(User vendeur) {
		this.vendeur = vendeur;
	}

	@Override
	public String toString() {
		return "Lot [note=" + note + ", acheteur=" + acheteur + ", vendeur=" + vendeur + ", dateAchat=" + dateAchat
				+ "]";
	}

	

}
