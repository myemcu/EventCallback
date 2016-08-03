package com.myemcu.app_5callbackevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private MyButton myButton; // 抽取方法，在变量名上点Ctrl+Alt+F

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取自定义Button对象
        myButton = (MyButton) findViewById(R.id.myBtn);
        // 注册监听并使用匿名内层实现其接口
        myButton.setOnTouchListener(new View.OnTouchListener() { //Alt+Enter->实现(接口)方法
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                System.out.println("监听器中的触摸事件触发了");
                Toast.makeText(MainActivity.this,"监听器中的触摸事件触发了", Toast.LENGTH_SHORT).show();
                return false; // 事件可向外传播
            }
        });
    }

    //Ctrl+O->onTouch...
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        System.out.println("MainActivity中的触摸事件触发了");
        Toast.makeText(this,"MainActivity中的触摸事件触发了", Toast.LENGTH_SHORT).show();
        return false; // 事件可向外传播

    }

    public void btn_Click(View v) {
        Toast.makeText(this,"标签按钮的触摸事件触发了", Toast.LENGTH_SHORT).show();
    }

}
