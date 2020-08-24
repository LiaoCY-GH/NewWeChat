package com.example.newwechat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TongXun extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_tongxun);

        initFruits();

        FruitAdapter adapter = new FruitAdapter(TongXun.this, R.layout.fruit_item, fruitList);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit a = new Fruit("新的朋友", R.drawable.a);
            fruitList.add(a);
            Fruit b = new Fruit("群聊", R.drawable.b);
            fruitList.add(b);
            Fruit c = new Fruit("标签", R.drawable.c);
            fruitList.add(c);
            Fruit d = new Fruit("公众号", R.drawable.d);
        }
    }
}