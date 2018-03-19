package org.androidtown.newjjjproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView text_login;
    private TextView text_id;
    private TextView text_pw;
    private EditText edit_id;
    private EditText edit_pw;
    private Button btn_enter;
    private Button btn_findPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void initView(){
        text_login = findViewById(R.id.text_login);
        text_id = findViewById(R.id.text_id);
        text_pw = findViewById(R.id.text_pw);
        edit_id = findViewById(R.id.edit_id);
        edit_pw = findViewById(R.id.edit_pw);
        btn_enter = findViewById(R.id.btn_enter);
        btn_findPw = findViewById(R.id.btn_findPw);
    }
}