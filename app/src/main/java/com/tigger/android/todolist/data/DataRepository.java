package com.tigger.android.todolist.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiabiao on 2016/10/13.
 */

public final class DataRepository {
    private static DataRepository instance;

    private DataRepository(){}

    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }

    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        Category category = new Category();
        category.setTitle("Work");
        categories.add(category);
        category = new Category();
        category.setTitle("Life");
        categories.add(category);
        return categories;
    }
}
