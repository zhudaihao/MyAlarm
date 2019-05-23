package cn.wqgallery.myalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/**
 * 创建个广播接受者  接收广播
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //判断接受到的广播意图里面的活动是不是 闹钟的意图
        if (TextUtils.equals(intent.getAction(),"alarm")){

            //处理需要 隔断时间就处理的事件
            Toast.makeText(context, "收到闹钟的活动", Toast.LENGTH_SHORT).show();

            Log.e("zdh","-----------收到闹钟的活动");
        }
    }



}
