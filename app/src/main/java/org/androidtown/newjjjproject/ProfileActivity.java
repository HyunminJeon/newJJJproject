package org.androidtown.newjjjproject;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    private ImageButton btn_profile;
    private ImageView img_profile;
    private Uri fileUri; //에러 방지


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        initView();
    }

    private void initView() {
        btn_profile = (ImageButton) findViewById(R.id.imgbtn_profile);
        img_profile = (ImageView) findViewById(R.id.img_profile);
        registerForContextMenu(btn_profile); //프로필 변경 메뉴
    }


    public void addProfile(View v) {
        openContextMenu(v);
    }


    //프로필 변경 메뉴
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("프로필 사진 설정"); //타이틀바
        menu.add(0, 1, 100, "갤러리에서 불러오기");
        menu.add(0, 2, 200, "사진 촬영");
    }




}
