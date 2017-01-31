package com.example.jeffreyadamski.csit551_demo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.jeffreyadamski.csit551_demo1.utils.utils.APP_TAG;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=(TextView) findViewById(R.id.text1);
        textView2=(TextView) findViewById(R.id.text2);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("some other Text");
                textView2.setText("Second Text");

           }
        });
            Log.i(APP_TAG, "use the >> onCreate >> method");
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop () {
        super.onStop();
    }
    @Override
    protected void onDestroy() {super.onDestroy();}

   class MyLsnr implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button2){
                textView1.setText("newText");
            Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
        }
            else if (view.getId()==R.id.button2)
                textView2.setText("New Text 2");
        }

    }

}