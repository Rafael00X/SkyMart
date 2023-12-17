package com.skymart.store.service.impl;

import com.skymart.store.entity.Category;
import com.skymart.store.repository.CategoryRepository;
import com.skymart.store.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
