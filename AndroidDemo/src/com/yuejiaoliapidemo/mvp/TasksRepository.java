
package com.yuejiaoliapidemo.mvp;

public class TasksRepository {
    private static TasksRepository INSTANCE = null;
    private TasksDataSource mTaskRemoteDataSource;

    public TasksRepository(TasksDataSource tasksRemoteDataSource) {
        mTaskRemoteDataSource = tasksRemoteDataSource;
    }

    public static TasksRepository getInstance(TasksDataSource tasksRemoteDataSource,
            TasksDataSource tasksLocalDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new TasksRepository(tasksRemoteDataSource);
        }
        return INSTANCE;
    }
}
