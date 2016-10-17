package com.tigger.android.todolist.addcategory;

import com.tigger.android.todolist.data.Category;
import com.tigger.android.todolist.data.DataRepository;

/**
 * Created by lixiabiao on 2016/10/13.
 */

public class AddCategoryPresenter implements AddCategoryContract.Presenter {
    private DataRepository mDataRepository;
    private AddCategoryContract.View mView;

    public AddCategoryPresenter(AddCategoryContract.View view) {
        mView = view;
        mDataRepository = DataRepository.getInstance();
    }

    @Override
    public void saveCategory(Category category) {
        mDataRepository.addCategory(category);

    }

    @Override
    public void start() {
    }
}
