package com.tigger.android.todolist.categorys;

import com.tigger.android.todolist.data.Category;
import com.tigger.android.todolist.data.DataRepository;

import java.util.List;

/**
 * Created by lixiabiao on 2016/10/13.
 */

public class TaskCategoryPresenter implements TaskCategoryContract.Presenter {
    private DataRepository mRepository;
    private TaskCategoryContract.View mView;

    public TaskCategoryPresenter(TaskCategoryContract.View view) {
        mView = view;
        mRepository = DataRepository.getInstance();
    }

    @Override
    public void loadAllCategories() {
        List<Category> categories = mRepository.getAllCategories();
        mView.showAllCategories(categories);
    }

    @Override
    public void start() {
        loadAllCategories();
    }
}
