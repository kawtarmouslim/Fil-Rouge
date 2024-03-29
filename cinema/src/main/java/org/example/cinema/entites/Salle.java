package org.example.cinema.entites;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int nombrePlace;
   @ManyToOne
   @JoinColumn(name = "id_cinema")
    private Cinema cinema;
    @OneToMany(mappedBy = "salle")
    private List<Place> places;
    @OneToMany(mappedBy = "salle")
    private List<Projection> projections;
}
