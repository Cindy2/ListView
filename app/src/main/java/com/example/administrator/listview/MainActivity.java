package com.example.administrator.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.loopj.android.image.SmartImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v){
        //下载图片
        //1.确定网址
//        File file = new File(getCacheDir(), "info.txt");
        String path = "http://192.168.13.13:8080/dd.jpg";
        //2.找到智能图片查看器对象
        SmartImageView siv = (SmartImageView) findViewById(R.id.imageview);
        //3.下载并显示图片
        siv.setImageUrl(path);
    }

}
