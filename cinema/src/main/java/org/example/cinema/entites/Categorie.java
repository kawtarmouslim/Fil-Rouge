package org.example.cinema.entites;




import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String nom;
    @OneToMany(mappedBy = "categorie")
    private List<Film> films;


}
