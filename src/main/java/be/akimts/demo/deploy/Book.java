package be.akimts.demo.deploy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private Long id;
    @Column(name = "book_title", nullable = false)
    private String title;
    @Column(name = "book_author", nullable = false)
    private String author;

}
