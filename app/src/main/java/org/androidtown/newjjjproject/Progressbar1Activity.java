package org.androidtown.newjjjproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Progressbar1Activity extends AppCompatActivity {
    private ProgressBar progressBar1;
    private TextView text_use;
    private Button btn_use1;
    private Button btn_use2;
    private Button btn_use3;
    private Button btn_use4;
    private Button btn_use5;
    private ImageButton imgbtn_back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar1);
        initView();
    }

    private void initView() {
        progressBar1 = findViewById(R.id.progressBar1);
        text_use = findViewById(R.id.text_use);
        btn_use1 = findViewById(R.id.btn_use1);
        btn_use2 = findViewById(R.id.btn_use2);
        btn_use3 = findViewById(R.id.btn_use3);
        btn_use4 = findViewById(R.id.btn_use4);
        btn_use5 = findViewById(R.id.btn_use5);
        imgbtn_back1 = findViewById(R.id.imgbtn_back1);
    }

//    public void btn_use1(View v){
//        progressBar1.setProgress(25);
//    }
//
//    public void btn_use2(View v){
//        progressBar1.setProgress(25);
//    }
//
//    public void btn_use3(View v){
//        progressBar1.setProgress(25);
//    }
//
//    public void btn_use4(View v){
//        progressBar1.setProgress(25);
//    }
//
//    public void btn_use5(View v){
//        progressBar1.setProgress(25);
//    }

    public void back1(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void front1(View view){
        Intent intent = new Intent(this, Progressbar2Activity.class);
        startActivity(intent);
        progressBar1.setProgress(25);
    }
}