
package com.yuejiaoliapidemo.mvp;

import android.os.Handler;

public class TaskRemoteDataSource implements TasksDataSource {

    @Override
    public void getTasks(LoadTasksCallback callback) {

    }

    @Override
    public void getTask(String id, GetTaskCallback callback) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, 0);
    }

    @Override
    public void saveTask(Task task) {

    }

    @Override
    public void completeTask(Task task) {

    }

    @Override
    public void completeTask(String taskId) {

    }

    @Override
    public void activateTask(Task task) {

    }

    @Override
    public void activateTask(String taskId) {

    }

    @Override
    public void clearCompletedTasks() {

    }

    @Override
    public void refreshTasks() {

    }

    @Override
    public void deleteAllTasks() {

    }

    @Override
    public void deleteTask(String taskId) {

    }

}
