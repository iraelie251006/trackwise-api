package tech.iraelie.trackwise_api.category;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.iraelie.trackwise_api.model.Transaction;
import tech.iraelie.trackwise_api.user.User;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private User user;

    @OneToMany(mappedBy = "category")
    private List<Transaction> transactions;
}
