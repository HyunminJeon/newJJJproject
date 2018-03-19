package org.androidtown.newjjjproject;

import android.content.SharedPreferences;

/**
 * Created by Jeon Hyunmin on 2018-03-19.
 */

// 이 클래스에서만 SharedPreference를 가질 수 있다.
// SharedPreference는 간단한 값들을 저장해 놓는 거라고 볼 수 있다. ex) 자동로그인, 초기값 저장. 어플을 끄기 전까지는, 저장해놓은 값들이 사라지지 않는다.

public class SharedPreferenceManager{
    private static String LOGIN = "login";
    private static SharedPreferenceManager spf = null;
    private static SharedPreferences.Editor loginEditor; // 데이터 기록을 위해서 SharedPreferences.Editor instance를 얻는다. 우리는 로그인을 위함이니, loginEditor!
    private int aaa;
}