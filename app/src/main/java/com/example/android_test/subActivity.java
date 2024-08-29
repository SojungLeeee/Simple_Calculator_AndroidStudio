package com.example.android_test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class subActivity extends AppCompatActivity {


    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        tv_sub = findViewById(R.id.tv_sub);


        //날아오는 데이터 값이 있으면 getIntent. 받겠다는 뜻
        Intent intent = getIntent();

        //string 형태로 날아온 데이터 값을 받기
        //name은 쏘아준 name 이랑 받는 name이랑 같아야함
        //MainActivity.java에서 name을 str로 줬으니까 str 받기
        String str = intent.getStringExtra("str");

        tv_sub.setText(str);



    }
}