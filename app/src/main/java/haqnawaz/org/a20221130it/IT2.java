package haqnawaz.org.a20221130it;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class IT2 extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity2", "Using onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity2","Using onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity2","Using onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity2","Using onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity2","Using onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity2","Using onRestart");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Activity2","Using onCreate");
        setContentView(R.layout.activity_it2);
    }
}