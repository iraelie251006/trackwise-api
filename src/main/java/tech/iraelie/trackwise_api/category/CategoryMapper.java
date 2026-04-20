package tech.iraelie.trackwise_api.category;

import tech.iraelie.trackwise_api.model.Transaction;
import tech.iraelie.trackwise_api.user.User;

import java.util.List;

public class CategoryMapper {
    public static CategoryDTO toDto(Category category) {
        if (category == null) return null;

        return CategoryDTO.builder()
                .name(category.getName())
                .build();
    }

    public static Category toEntity(CategoryDTO dto, User user, List<Transaction> transactions) {
        if (dto == null) return null;

        Category category = new Category();
        category.setName(dto.getName());
        category.setUser(user);
        category.setTransactions(transactions);

        return category;
    }
}
