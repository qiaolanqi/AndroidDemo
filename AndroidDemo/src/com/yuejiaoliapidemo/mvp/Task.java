
package com.yuejiaoliapidemo.mvp;

public class Task {
    private String mId;
    private String mTitle;
    private boolean mCompleted;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public boolean isCompleted() {
        return mCompleted;
    }

    public void setmCompleted(boolean completed) {
        this.mCompleted = completed;
    }

}
