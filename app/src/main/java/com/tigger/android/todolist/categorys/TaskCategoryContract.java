package com.tigger.android.todolist.categorys;

import com.tigger.android.todolist.BasePresenter;
import com.tigger.android.todolist.BaseView;
import com.tigger.android.todolist.data.Category;

import java.util.List;

/**
 * Created by lixiabiao on 2016/10/13.
 */

public interface TaskCategoryContract {
    interface Presenter extends BasePresenter {
        void loadAllCategories();
    }

    interface View extends BaseView<Presenter> {
        void showAllCategories(List<Category> categories);
        void gotoAddCategoryActivity();
    }
}
