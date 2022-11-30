package haqnawaz.org.a20221130it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity1", "Using onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity1","Using onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity1","Using onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity1","Using onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity1","Using onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity1","Using onRestart");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Activity1", "Using onCreate");
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intt = new Intent(MainActivity.this,IT2.class);
                startActivity(intt);
            }
        });

    }
}