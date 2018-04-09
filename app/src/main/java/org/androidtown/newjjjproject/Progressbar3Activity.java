package org.androidtown.newjjjproject;


import android.content.Intent;
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
        private Button btn_weight1;
        private Button btn_weight2;
        private Button btn_weight3;
        private Button btn_weight4;
        private Button btn_weight5;
        private Button btn_weight6;
        private ImageButton imgbtn_back3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_progressbar3);
            initView();
        }

        private void initView() {
            progressBar3 = findViewById(R.id.progressBar3);
            text_weight = findViewById(R.id.text_weight);
            btn_weight1 = findViewById(R.id.btn_weight1);
            btn_weight2 = findViewById(R.id.btn_weight2);
            btn_weight3 = findViewById(R.id.btn_weight3);
            btn_weight4 = findViewById(R.id.btn_weight4);
            btn_weight5 = findViewById(R.id.btn_weight5);
            btn_weight6 = findViewById(R.id.btn_weight6);
            imgbtn_back3 = findViewById(R.id.imgbtn_back3);
        }

//        public void btn_weight1(View v) {
//            progressBar3.setProgress(75);
//        }
//
//        public void btn_weight2(View v) {
//            progressBar3.setProgress(75);
//        }
//
//        public void btn_weight3(View v) {
//            progressBar3.setProgress(75);
//        }
//
//        public void btn_weight4(View v) {
//            progressBar3.setProgress(75);
//        }
//
//        public void btn_weight5(View v) {
//            progressBar3.setProgress(75);
//        }
//
//        public void btn_weight6(View v) {
//            progressBar3.setProgress(75);
//        }

        public void back3(View v) {
            Intent intent = new Intent(this, Progressbar2Activity.class);
            startActivity(intent);
        }

        public void front3(View view){
            Intent intent = new Intent(this, Progressbar4Activity.class);
            startActivity(intent);
            progressBar3.setProgress(75);
        }
    }