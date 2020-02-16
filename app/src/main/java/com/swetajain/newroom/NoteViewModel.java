package com.swetajain.newroom;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class NoteViewModel extends AndroidViewModel {

    private String TAG = this.getClass().getSimpleName();

    public NoteViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(TAG,"Note View Model destroyed!");
    }
}
