package fr.formation.inti.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	@Size(min=3, max=30, message="doit contenir entre 3 et 30 characteres")@NotNull
	private String prenom;
	
	@Size(min=3, max=30, message="doit contenir entre 3 et 30 characteres")@NotNull
	private String nom;
	@Email(message = "Email valide svp")
	private String email;
	private String animal;
	private String element;
	
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	@Override
	public String toString() {
		return "User [prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", animal=" + animal + ", element="
				+ element + "]";
	}
	
	
	
	

}
