package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        LinearLayout linear = new LinearLayout(this);


        CheckBox checkbox1 = findViewById(R.id.checkbox1);
        CheckBox checkbox2 = findViewById(R.id.checkbox2);
        CheckBox checkbox3 = findViewById(R.id.checkbox3);

        EditText editText;
        TextView textView;
    }

    public void button_click(View view) {

        Button cancel_bt = new Button(this);

        Button submit_bt = new Button(this);

        TextView textView = (TextView) findViewById(R.id.put_username);
        Log.d(this.getClass().getName(), (String) textView.getText());
        textView.setText("input username");

        textView = (TextView) findViewById(R.id.put_id);
        Log.d(this.getClass().getName(), (String) textView.getText());
        textView.setText("input username");

        textView = (TextView) findViewById(R.id.put_password);
        Log.d(this.getClass().getName(), (String) textView.getText());
        textView.setText("input username");

        textView = (TextView) findViewById(R.id.put_phone);
        Log.d(this.getClass().getName(), (String) textView.getText());
        textView.setText("input username");

    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) buttonView.setText("개인정보 수집에 동의합니다.");
        else buttonView.setText("개인정보 수집에 동의하지 않습니다");

        if (isChecked) buttonView.setText("GPS 위치정보 수집에 동의합니다.");
        else buttonView.setText("GPS 위치정보 수집에 동의하지 않습니다.");

        if (isChecked) buttonView.setText("푸쉬 알림 수신에 동의합니다.");
        else buttonView.setText("푸쉬 알림 수신에 동의하지 않습니다.");
    }
}