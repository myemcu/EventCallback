package com.myemcu.app_5callbackevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/8/3.
 */
public class MyButton extends Button { //Alt+Enter 创建构造器(选择带两个参数的)

    private Context context;

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.context=context;
    }

    @Override//Ctrl+O后敲onTouch即可找到
    public boolean onTouchEvent(MotionEvent event) {

        System.out.println("MyButton中的触摸事件触发了");
        Toast.makeText(context,"MyButton中的触摸事件触发了", Toast.LENGTH_SHORT).show();

        //return true;      // 事件终结
        return false;       // 事件可以向外传播
    }
}
