package com.example.asynctaskloaderexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.util.Log;

class MyLoader extends AsyncTaskLoader<String> {


    public MyLoader(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    protected void onReset() {
        super.onReset();
    }

    @Override
    protected void onStopLoading() {
        super.onStopLoading();
    }

    @Nullable
    @Override
    public String loadInBackground() {
        for (int i = 0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.d("TASK:",i+"%Completed");
        }
        return null;
    }
}
