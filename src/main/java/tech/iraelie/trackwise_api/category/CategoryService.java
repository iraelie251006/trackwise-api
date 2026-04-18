package tech.iraelie.trackwise_api.category;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CategoryService implements CategoryInterface{
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    @Transactional
    public CategoryResponse createCategory(CategoryRequest category) {
        if (category == null) return null;

        CategoryDTO dto = new CategoryDTO(category.getName());

        return null;
    }

    @Override
    public Category getCategory(String name) {
        return categoryRepository.getCategory(name);
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAllCategories();
    }
}
