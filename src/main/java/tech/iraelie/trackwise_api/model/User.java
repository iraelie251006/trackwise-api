package tech.iraelie.trackwise_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import tech.iraelie.trackwise_api.category.Category;

import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Category> categories;
}
