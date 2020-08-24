package com.example.newwechat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Weixin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_weixin);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.caidan, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cd1:
                Toast.makeText(this, "点击了发起群聊", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cd2:
                Toast.makeText(this, "点击了增添朋友", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cd3:
                Toast.makeText(this, "点击了扫一扫", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cd4:
                Toast.makeText(this, "点击了收付款", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
