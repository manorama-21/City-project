package com.sbproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Save a new category
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Find all categories
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Find category by ID
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    // Delete category by ID
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }
}

