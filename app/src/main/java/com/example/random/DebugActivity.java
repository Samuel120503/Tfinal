package com.example.random;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends Activity {
    protected static final String TAG = "filtro";
    protected void  onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Log.i(TAG, "onCreate chamado");
    }
    protected void onStart() {
        super.onStart();
        Log.i(TAG,  "onStart chamado");
    }
    protected void onResume() {
        super.onResume();
        Log.i(TAG,  "onResume chamado");
    }
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,  "onRestart chamado");
    }
    protected void onPause() {
        super.onPause();
        Log.i(TAG,  "onPause chamado");
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,  "onSaveInstanceState chamado");
    }
    protected void onStop() {
        super.onStop();
        Log.i(TAG,  "onStop chamado");
    }
    protected void  onDestroy(){
        super.onDestroy();
        Log.i(TAG,  "onDestroy chamado");
    }

}
