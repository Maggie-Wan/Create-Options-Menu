package com.example.student.CreateOptionsMenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override  //利用程式產生options menu
    //這個方法會傳入一個menu物件(就是三個點)
    public boolean onCreateOptionsMenu(Menu menu) {
        //增加選單(作法一)
        //menu.add("option1");
        //menu.add("option2");

        //增加選單更好的做法(作法二)
        //menu.add(0,1,0,"option1");
        //menu.add(0,2,0,"otpion2");

        //用resource file設定option menu的作法(作法三)
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override //偵測哪一個選單被按下，會傳回item
    public boolean onOptionsItemSelected(MenuItem item) {
        //這邊的id是R檔中的id
        if(item.getItemId()==R.id.menu1){
            Toast.makeText(this,"option1 is selected",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.menu2){
            Toast.makeText(this,"option2 is selected",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
