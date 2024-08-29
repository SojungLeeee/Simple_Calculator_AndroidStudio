package com.example.android_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText et_1;
    EditText et_2;
    EditText et_result;
    EditText focusedEditText;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_0;
    Button btn_dot;
    Button btn_percent;
    Button btn_plus;
    Button btn_minus;
    Button btn_multiply;
    Button btn_slash;
    Button btn_reset;

    @Override

    //onCreate -> 어플을 처음 실행했을때 실행됨

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText 초기화
        et_1 = findViewById(R.id.et_1);
        et_2 = findViewById(R.id.et_2);
        et_result = findViewById(R.id.et_result);

        // 버튼 초기화
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_0 = findViewById(R.id.btn_0);
        btn_dot = findViewById(R.id.btn_dot);
        btn_percent = findViewById(R.id.btn_percent);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_slash = findViewById(R.id.btn_slash);
        btn_reset = findViewById(R.id.btn_reset);



        // EditText가 포커스될 때 해당 EditText를 focusedEditText에 저장
        et_1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    focusedEditText = et_1;
                }
            }
        });

        et_2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    focusedEditText = et_2;
                }
            }
        });


        // 버튼 클릭 리스너 설정
        setButtonClickListener(btn_1);
        setButtonClickListener(btn_2);
        setButtonClickListener(btn_3);
        setButtonClickListener(btn_4);
        setButtonClickListener(btn_5);
        setButtonClickListener(btn_6);
        setButtonClickListener(btn_7);
        setButtonClickListener(btn_8);
        setButtonClickListener(btn_9);
        setButtonClickListener(btn_0);
        setButtonClickListener(btn_dot);

//        btn_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String num = btn_1.getText().toString();
//                String currentText = et_1.getText().toString();
//                et_1.setText(currentText+num);
//            }
//        });
//
//        btn_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String num = btn_2.getText().toString();
//                String currentText = et_1.getText().toString();
//                et_1.setText(currentText+num);
//            }
//        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //num1, num2를 실수형태로 저장
                //String 형태를 float형태로 변환하기위해 Float.parseFloat 필요

                // num1, num2를 실수형태로 저장
                Float num1 = Float.parseFloat(et_1.getText().toString());
                Float num2 = Float.parseFloat(et_2.getText().toString());

                // 두 숫자의 합
                Float resultnum = num1 + num2;

                // 결과를 String 형태로 변환하여 EditText에 설정
                et_result.setText("  결과값 : " + String.valueOf(resultnum));

            }
        });



        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //num1, num2를 실수형태로 저장
                //String 형태를 float형태로 변환하기위해 Float.parseFloat 필요

                // num1, num2를 실수형태로 저장
                Float num1 = Float.parseFloat(et_1.getText().toString());
                Float num2 = Float.parseFloat(et_2.getText().toString());

                // 두 숫자의 차
                Float resultnum = num1 - num2;

                // 결과를 String 형태로 변환하여 EditText에 설정
                et_result.setText("  결과값 : " + String.valueOf(resultnum));

            }
        });


        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //num1, num2를 실수형태로 저장
                //String 형태를 float형태로 변환하기위해 Float.parseFloat 필요

                // num1, num2를 실수형태로 저장
                Float num1 = Float.parseFloat(et_1.getText().toString());
                Float num2 = Float.parseFloat(et_2.getText().toString());

                // 두 숫자의 곱
                Float resultnum = num1 * num2;

                // 결과를 String 형태로 변환하여 EditText에 설정
                et_result.setText("  결과값 : " + String.valueOf(resultnum));

            }
        });


        btn_slash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //num1, num2를 실수형태로 저장
                //String 형태를 float형태로 변환하기위해 Float.parseFloat 필요

                // num1, num2를 실수형태로 저장
                Float num1 = Float.parseFloat(et_1.getText().toString());
                Float num2 = Float.parseFloat(et_2.getText().toString());

                // 두 숫자의 몫
                Float resultnum = num1 / num2;

                // 결과를 String 형태로 변환하여 EditText에 설정
                et_result.setText("  결과값 : " + String.valueOf(resultnum));

            }
        });


        btn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //num1, num2를 실수형태로 저장
                //String 형태를 float형태로 변환하기위해 Float.parseFloat 필요

                // num1, num2를 실수형태로 저장
                Float num1 = Float.parseFloat(et_1.getText().toString());
                Float num2 = Float.parseFloat(et_2.getText().toString());

                // 두 숫자의 나머지
                Float resultnum = num1 % num2;

                // 결과를 String 형태로 변환하여 EditText에 설정
                et_result.setText("  결과값 : " + String.valueOf(resultnum));

            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noText = "";
                focusedEditText.setText(noText);
            }
        });





    }

    private void setButtonClickListener(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 버튼의 텍스트를 가져와서 EditText에 추가
                String num = button.getText().toString();
                if (focusedEditText != null) { //만약 focusedEditText가 null이 아니면
                    String currentText = focusedEditText.getText().toString();
                    focusedEditText.setText(currentText + num); //원래 있는 text+눌러진 숫자 테스트 추가
                }
            }
        });





    }
}

