package tech.iraelie.trackwise_api.category;

import java.util.List;

public interface CategoryInterface {
    CategoryResponse createCategory(CategoryRequest category);

    Category getCategory(String name);

    List<Category> findAllCategories();
}
