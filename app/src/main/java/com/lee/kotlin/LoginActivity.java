package com.lee.kotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        System.out.println("床前明月光,疑是地上霜,举头望明月,低头思故乡");
        Toast.makeText(this,"哈哈,真好玩",Toast.LENGTH_LONG).show();
        System.out.println("现在是在dev分支中进行开发.....1111111");
    }
}