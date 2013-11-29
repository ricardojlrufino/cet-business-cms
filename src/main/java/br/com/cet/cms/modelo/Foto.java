package br.com.cet.cms.modelo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/** 
 * @authores Jivago, Bruno, marcelo, Alexandre
 *
 */
@Entity
public class Foto extends Imagem {

	@ManyToOne
	@JoinColumn(name = "fotos")
	private GaleriaDeFoto galeriaDeFoto;

	public GaleriaDeFoto getGaleriaDeFoto() {
		return galeriaDeFoto;
	}

	public void setGaleriaDeFoto(GaleriaDeFoto galeriaDeFoto) {
		this.galeriaDeFoto = galeriaDeFoto;
	}

}
