
package com.yuejiaoliapidemo.mvp;

import com.yuejiaoliapidemo.R;
import com.yuejiaoliapidemo.mvp.TaskContract.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TaskFragment extends Fragment implements TaskContract.View {

    private Presenter mTaskPresenter;
    private TextView mTextView;

    @Override
    public void setPresenter(Presenter presenter) {
        mTaskPresenter = presenter;
    }

    @Override
    public void showTitle(String title) {
        mTextView.setText(title);
    }

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable
    ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detail, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable
    Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTextView = (TextView) getView().findViewById(R.id.textView1);
    }

    @Override
    public void onResume() {
        super.onResume();
        mTaskPresenter.start();
    }

}
