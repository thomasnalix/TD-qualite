package etud;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.Arrays;
import java.util.HashSet;

/** Représente un groupe d'entités */
public class Groupe extends Entite {

	/** Le nom de l'entité */
	private String nom;
	/** La couleur de l'entité */
	private String couleur;
	/** La forme de l'entité */
	private Node maForme;
	private HashSet<Entite> contenu = new HashSet<>();

	/**
	 * Stockage de convénience pour le groupe
	 */
	private Group monGroupe = new Group();

	/**
	 * Le handler pour gérer la souris
	 */
	private EventHandler<? super MouseEvent> handler;

	/**
	 * Mes couleurs courantes
	 */
	private Color[] mesCouleurs;

	/**
	 * Crée un groupe.
	 *
	 * @param nom     son nom
	 * @param couleur sa couleur
	 */
	public Groupe(String nom, String couleur) {
		super(nom, couleur);
		setMaForme(monGroupe);
		mesCouleurs = new Color[1];
		mesCouleurs[0] = Color.valueOf(getCouleur());

		getMaForme().addEventFilter(MouseEvent.MOUSE_CLICKED, this::mouseClicked);
	}

	/**
	 * Ajoute une entité au groupe.
	 *
	 * @param p l'entité à ajouter.
	 */
	public void ajouter(Entite p) {
		contenu.add(p);
		monGroupe.getChildren().add(p.getMaForme());
		p.setBordure(mesCouleurs);
	}

	/**
	 * Retire une entité du groupe.
	 *
	 * @param p l'entité à retirer.
	 */
	public void supprimer(Entite p) {
		contenu.remove(p);
		monGroupe.getChildren().remove(p.getMaForme());
		p.restaureBordure();
	}

	public void setOnMouseClicked(EventHandler<? super MouseEvent> mouseClicked) {
		for (Entite child : contenu)
			child.setOnMouseClicked(mouseClicked);
		handler = mouseClicked;
	}

	public void setBordure(Color... couleurs) {
		mesCouleurs = Arrays.copyOf(couleurs, couleurs.length + 1);
		mesCouleurs[couleurs.length] = Color.valueOf(getCouleur());
		for (Entite child : contenu)
			child.setBordure(mesCouleurs);
	}

	public void restaureBordure() {
		mesCouleurs = new Color[1];
		mesCouleurs[0] = Color.valueOf(getCouleur());
		for (Entite child : contenu)
			child.setBordure(mesCouleurs);
	}

	/**
	 * Méthode pour filtrer les clicks sur les membres du groupe
	 */
	public void mouseClicked(MouseEvent mouseEvent) {
		handler.handle(mouseEvent);
		mouseEvent.consume();
	}

	public void deplacer() {
		for (Entite e : contenu) {
			e.deplacer();
		}
	}


	public void couleurNormal() {
		for (Entite child : contenu)
			child.couleurNormal();
	}


	public void couleurSelection() {
		for (Entite child : contenu)
			child.couleurSelection();
	}

	public void setMaForme(Node maForme) {
		this.maForme = maForme;
		maForme.setUserData(this); // Permet de retrouver le modèle associé à la vue
	}

	/** Retourne la couleur de l'entité */
	public String getCouleur() {
		return couleur;
	}

	/** Retourne la forme de l'entité */
	public Node getMaForme() {
		return maForme;
	}
}
