package com.example.midterm_multi_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.util.Log.i("액티비티 테스트", "onCreate()");

        final RadioButton rdoSecond = findViewById(R.id.rdoSecond);

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;

                if (rdoSecond.isChecked() == true)
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                else
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);

                startActivity(intent);
            }
        });

        Button btnDial = findViewById(R.id.btnDial);
        Button finish = findViewById(R.id.finish);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:01012222222");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i("액티비티 테스트", "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i("액티비티 테스트", "onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i("액티비티 테스트", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i("액티비티 테스트", "onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i("액티비티 테스트", "onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i("액티비티 테스트", "onResume()");
    }
}