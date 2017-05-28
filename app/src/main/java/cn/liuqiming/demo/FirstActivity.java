package cn.liuqiming.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * 第一个Activity
 * Created by Timmy on 2017/5/28.
 */
public class FirstActivity extends AppCompatActivity {
    public static final String TAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //表示Activity正在被创建，这是生命周期的第一个方法，一般做一些初始化工作.
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: ");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {  //Activity正在被启动，Activity已经是可见的了，但是还没有出现在前台，还无法和用户交互，可以理解为Activity已经显示出来了，但是无法我们还无法看到.
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onResume() { //activity已经是课件的了.并且出现在前台活动
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {  //表示Activiyt正在停止，正常情况下，紧接着onPause就会被调用
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {   //表示Activity即将停止，已经完全看不到了.可以做一些稍微轻量级的回收工作，但是不能太耗时.
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {    //Activity即将被销毁，可以做一些回收工作和最终资源的释放。
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    public void toSceondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    /**
     * 当内存不足，导致Activity优先级低的Activity被杀死.分五种优先级
     * 1.forground processes    前台进程
     * 2.Visible Processes  可见进程
     * 3.Service Processes  服务进程
     * 4.Background Processes   后台进程
     * 5.Empty Processes    空进程
     * **/
}