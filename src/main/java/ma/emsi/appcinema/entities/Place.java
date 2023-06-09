package ma.emsi.appcinema.entities;

import java.util.Collection;

import jakarta.persistence.*;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Place {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int numero;
	private double longitude,latidude,altitude;
	@ManyToOne
	private Salle salle;
	@OneToMany(mappedBy="place")
	@JsonProperty(access=Access.WRITE_ONLY)
	private Collection<Ticket> tickets;
}


