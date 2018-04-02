package org.androidtown.newjjjproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Progressbar3Activity extends AppCompatActivity {
    private ProgressBar progressBar3;
    private TextView text_weight;
    private Button btn_kg1;
    private Button btn_kg2;
    private Button btn_kg3;
    private Button btn_kg4;
    private Button btn_kg5;
    private Button btn_kg6;
    private ImageButton imgbtn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar3);
        initView();
    }

    private void initView() {
        progressBar3 = findViewById(R.id.progressBar4);
        text_weight = findViewById(R.id.text_design);
        btn_kg1 = findViewById(R.id.btn_design1);
        btn_kg2 = findViewById(R.id.btn_design2);
        btn_kg3 = findViewById(R.id.btn_design3);
        btn_kg4 = findViewById(R.id.btn_design4);
        btn_kg5 = findViewById(R.id.btn_design5);
        btn_kg6 = findViewById(R.id.btn_design6);
        imgbtn_back = findViewById(R.id.imgbtn_back);
    }

    public void btn_kg1(View v){
        progressBar3.setProgress(30);
    }

    public void btn_kg2(View v){
        progressBar3.setProgress(30);
    }

    public void btn_kg3(View v){
        progressBar3.setProgress(30);
    }

    public void btn_kg4(View v){
        progressBar3.setProgress(30);
    }

    public void btn_kg5(View v){
        progressBar3.setProgress(30);
    }

    public void btn_kg6(View v){
        progressBar3.setProgress(30);
    }

    public void back(){

    }
}