package org.example.cinema.entites;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nom;
    private  double longitude,laltitude,altitude;
    private  int nombreSalles;

    @OneToMany(mappedBy = "cinema")
    private List<Salle> sales;
    @ManyToOne
    private Ville ville;
}
