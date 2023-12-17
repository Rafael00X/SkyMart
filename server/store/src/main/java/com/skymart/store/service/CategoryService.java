package com.skymart.store.service;

import com.skymart.store.entity.Category;

public interface CategoryService {
    Category createCategory(Category category);

    Category getCategoryById(Integer id);
}
