
package com.yuejiaoliapidemo.mvp;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.yuejiaoliapidemo.R;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class TaskActivity extends AppCompatActivity {
    private TaskFragment mTaskFragment;
    private TaskPresenter mTaskPresenter;

    @Override
    protected void onCreate(@Nullable
    Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        
        mTaskFragment = new TaskFragment();
        mTaskPresenter = new TaskPresenter(mTaskFragment);
        mTaskFragment.setPresenter(mTaskPresenter);
        switchFragment(mTaskFragment);
    }

    private void switchFragment(TaskFragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, fragment);
        transaction.commit();
    }
}
