package tech.iraelie.trackwise_api.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
    @Query("SELECT c FROM Category c")
    List<Category> findAllCategories();

    // N.B: It's also possible to use findCategoryByName
    @Query("SELECT c FROM Category c WHERE c.name = :name")
    Category getCategory(@Param("name") String name);

    CategoryResponse createCategory(CategoryRequest category);
}
