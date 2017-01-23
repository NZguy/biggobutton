package edu.washington.drma.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // My button
        myButton = (Button)findViewById(R.id.btnPushMe);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                clickCount++;
                Log.d("drma_MainActivity", "button clicked");
                MainActivity.this.myButton.setText("You have pushed me " + (clickCount) + " times!");
            }
        });
    }
}
