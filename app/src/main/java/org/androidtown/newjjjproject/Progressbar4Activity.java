package org.androidtown.newjjjproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Progressbar4Activity extends AppCompatActivity {
    private ProgressBar progressBar4;
    private TextView text_design;
    private Button btn_design1;
    private Button btn_design2;
    private Button btn_design3;
    private Button btn_design4;
    private Button btn_design5;
    private Button btn_design6;
    private ImageButton imgbtn_back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar3);
        initView();
    }

    private void initView() {
        progressBar4 = findViewById(R.id.progressBar4);
        text_design = findViewById(R.id.text_design);
        btn_design1 = findViewById(R.id.btn_design1);
        btn_design2 = findViewById(R.id.btn_design2);
        btn_design3 = findViewById(R.id.btn_design3);
        btn_design4 = findViewById(R.id.btn_design4);
        btn_design5 = findViewById(R.id.btn_design5);
        btn_design6 = findViewById(R.id.btn_design6);
        imgbtn_back2 = findViewById(R.id.imgbtn_back2);
    }

    public void btn_design1(View v){
        progressBar4.setProgress(45);
    }

    public void btn_design2(View v){
        progressBar4.setProgress(45);
    }

    public void btn_design3(View v){
        progressBar4.setProgress(45);
    }

    public void btn_design4(View v){
        progressBar4.setProgress(45);
    }

    public void btn_design5(View v){
        progressBar4.setProgress(45);
    }

    public void btn_design6(View v){
        progressBar4.setProgress(45);
    }

    public void back2(View v) {
    }
}