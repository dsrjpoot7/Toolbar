package com.example.hp.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
       ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /* ActionBar actionBar = getSupportActionBar();
      //  getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("gyftj");
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#008577")));
        //   actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.bg_side_menu));
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(//Center the textview in the ActionBar !
                ActionBar.LayoutParams.MATCH_PARENT,
                ActionBar.LayoutParams.MATCH_PARENT
                );
        LayoutInflater layoutInflater=getLayoutInflater();
        View viewActionBar = layoutInflater.inflate(R.layout.general_top_header, null);
        actionBar.setCustomView(viewActionBar, params);

        TextView _Header_Text_View = (TextView)findViewById(R.id.header_Name);
        _Header_Text_View.setText("" + "hello");
        final ImageView back_Button = (ImageView)findViewById(R.id.imageView);

        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Demo.class));




            }
        });

*/

       Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);


       ImageView img=(ImageView)findViewById(R.id.img);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Demo.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "toolbarHeader#click", Toast.LENGTH_SHORT).show();
            }

        });

        }

}
