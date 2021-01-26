package com.example.apppracticados;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class AppLifeManager implements LifecycleEventObserver {
    public void setOwner(Lifecycle lf){
        lf.addObserver(this);
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resumeHappened(){
        Log.d(  "Sample", "The onResume was invoked");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pauseHappened(){
        Log.d(  "Sample", "The pause was invoked");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onEventHappened(){
        Log.d(  "Sample", "The onEvent was invoked");
    }
    @Override
    public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
        Log.d(  "Sample", "The onStateChanged was invoked");
    }
}
