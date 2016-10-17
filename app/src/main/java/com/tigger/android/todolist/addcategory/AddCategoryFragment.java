package com.tigger.android.todolist.addcategory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.tigger.android.todolist.R;
import com.tigger.android.todolist.data.Category;
import com.tigger.android.todolist.data.DataRepository;

/**
 * Created by lixiabiao on 2016/10/13.
 */

public class AddCategoryFragment extends Fragment implements AddCategoryContract.View {
    private EditText mAddCategoryText;
    private Button mAddCategoryButton;
    private AddCategoryContract.Presenter mPresenter;

    public AddCategoryFragment() {
        mPresenter = new AddCategoryPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_add_category,container,false);
        mAddCategoryText = (EditText)view.findViewById(R.id.add_category_item_edit_text);
        mAddCategoryButton = (Button) view.findViewById(R.id.add_category_item_button);
        mAddCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCategory();
                getActivity().finish();
            }
        });

        return view;
    }

    @Override
    public void addCategory() {
        String categoryName = mAddCategoryText.getText().toString();
        Category category = new Category();
        category.setTitle(categoryName);
        mPresenter.saveCategory(category);

    }

    @Override
    public void setPresenter(AddCategoryContract.Presenter presenter) {
        mPresenter = presenter;

    }
}
