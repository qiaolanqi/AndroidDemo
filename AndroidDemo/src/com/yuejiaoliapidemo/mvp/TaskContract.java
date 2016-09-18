
package com.yuejiaoliapidemo.mvp;

public interface TaskContract {
    interface View extends BaseView<Presenter> {
        void showTitle(String title);
    }

    interface Presenter extends BasePresenter {
        void editTask();
    }
}
