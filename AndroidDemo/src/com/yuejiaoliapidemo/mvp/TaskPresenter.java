
package com.yuejiaoliapidemo.mvp;

import com.yuejiaoliapidemo.mvp.TaskContract.View;

public class TaskPresenter implements TaskContract.Presenter {

    private View mTaskFragment;

    public TaskPresenter(TaskContract.View taskFragment) {
        mTaskFragment = taskFragment;
    }

    @Override
    public void start() {
        openTask();
    }

    private void openTask() {
        mTaskFragment.showTitle("哈哈 我的工作平台");
    }

    @Override
    public void editTask() {

    }

}
