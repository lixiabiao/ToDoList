package com.tigger.android.todolist.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiabiao on 2016/10/13.
 */

public final class DataRepository {
    private static DataRepository instance;
    private List<Category> categories = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();

    private DataRepository(){}

    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }

    public List<Category> getAllCategories() {

        Category category = new Category();
        category.setTitle("Work");
        categories.add(category);
        category = new Category();
        category.setTitle("Life");
        categories.add(category);
        return categories;
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public List<Task> getAllTasks() {
        tasks.clear();
        Task task = new Task();
        task.setTitle("go home");
        tasks.add(task);
        task = new Task();
        task.setTitle("go to bed");
        tasks.add(task);
        return tasks;
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
}
