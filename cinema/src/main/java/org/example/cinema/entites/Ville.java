package org.example.cinema.entites;



import javax.persistence.*;
import java.util.List;

@Entity(name = "ville")
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nom;
    private  double longitude,laltitude,altitude;
    @OneToMany(mappedBy = "ville") //une association bidirectionnel
    private List<Cinema> cinemas;
}
