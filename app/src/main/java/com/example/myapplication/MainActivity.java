package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String arrayName[] = {"Facebook",
        "Twitter",
        "Tumblr ",
        "Google Drive",
        "Instagram"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.remove)
                .addSubMenu(Color.parseColor("#6081C4"), R.drawable.fb)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.twitter)
                .addSubMenu(Color.parseColor("#395976"), R.drawable.tum)
                .addSubMenu(Color.parseColor("#ff471a"), R.drawable.go)
                .addSubMenu(Color.parseColor("#ffffff"), R.drawable.insta)
                .setOnMenuSelectedListener(new OnMenuSelectedListener(){
                @Override
                    public void onMenuSelected(int index)
                    {
                        Toast.makeText(MainActivity.this, "You selected " +arrayName[index], Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
