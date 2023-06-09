package ma.emsi.appcinema.entities;

import jakarta.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Ticket {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length = 75)
	private String nomClient;
	private double prix;
	@Column(unique=false)
	private Integer codePayement;
	private boolean reserve;
	@ManyToOne
	private Place place;
	@ManyToOne
	private Projection projection;
}
