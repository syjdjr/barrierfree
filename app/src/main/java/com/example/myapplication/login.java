package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        LinearLayout linear = new LinearLayout(this);



    }

    public void button_click (View view){
        Button signup_bt = new Button(this);
        Button login_bt = new Button(this);

        TextView textView = (TextView) findViewById(R.id.username);
        Log.d(this.getClass().getName(), (String) textView.getText());
        textView.setText("input username");

        textView = (TextView) findViewById(R.id.password);
        Log.d(this.getClass().getName(), (String) textView.getText());
        textView.setText("input password");
    }

}





