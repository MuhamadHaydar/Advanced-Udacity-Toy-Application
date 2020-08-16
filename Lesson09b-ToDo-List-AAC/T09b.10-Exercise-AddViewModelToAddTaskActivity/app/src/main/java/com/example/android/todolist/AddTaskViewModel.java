package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

// TODO (5) Make this class extend ViewModel Okay
public class AddTaskViewModel extends ViewModel {


    // TODO (6) Add a task member variable for the TaskEntry object wrapped in a LiveData Okay
    private LiveData<TaskEntry> mTask;

    // TODO (8) Create a constructor where you call loadTaskById of the taskDao to initialize the tasks variable Okay
    // Note: The constructor should receive the database and the taskId Okay

    public AddTaskViewModel(AppDatabase mDb, int mTaskId) {
        mTask = mDb.taskDao().loadTaskById(mTaskId);
    }

    // TODO (7) Create a getter for the task variable Okay
    public LiveData<TaskEntry> getTask() {
        return mTask;
    }

}
