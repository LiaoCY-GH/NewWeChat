package com.example.newwechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        editText = findViewById(R.id.edt_send);
        button = findViewById(R.id.btn_send);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_send:
                //获取EditView的内容数据
                String string = editText.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                intent.putExtra("send", string);
                startActivity(intent);
                break;
        }

    }
}