package com.project.Service;

import com.project.Model.Category;
import com.project.Repositary.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Page<Category> findAll(int page) {
        return categoryRepository.findAll(PageRequest.of(page, 10));
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null); // or throw exception if preferred
    }

    public Category update(Long id, Category categoryDetails) {
        Category category = findById(id);
        if (category != null) {
            category.setName(categoryDetails.getName());
            return categoryRepository.save(category);
        }
        return null;
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}