
package com.yuejiaoliapidemo.mvp;

import java.util.List;

public interface TasksDataSource {
    interface LoadTasksCallback {
        void onTaskLoaded(List<Task> tasks);

        void onDataNotAvailable();
    }

    interface GetTaskCallback {
        void onTaskLoaded(Task task);

        void onDataNotAvailable();
    }

    void getTasks(LoadTasksCallback callback);

    void getTask(String id, GetTaskCallback callback);

    void saveTask(Task task);

    void completeTask(Task task);

    void completeTask(String taskId);

    void activateTask(Task task);

    void activateTask(String taskId);

    void clearCompletedTasks();

    void refreshTasks();

    void deleteAllTasks();

    void deleteTask(String taskId);
}
