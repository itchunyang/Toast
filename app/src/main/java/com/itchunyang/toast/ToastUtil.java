package com.itchunyang.toast;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

/**
 * Created by luchunyang on 2016/12/3.
 */

public class ToastUtil {
    private static Toast toast;
    private static Handler handler = new Handler();

    public static void showToast(Context context,String message){
        handler.removeCallbacks(runnable);
        if(toast == null){
            toast = Toast.makeText(context,message,Toast.LENGTH_LONG);
        }else{
            toast.setText(message);
        }

        toast.show();
        handler.postDelayed(runnable,3000);//3秒后隐藏
    }

    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            toast.cancel();
            toast = null;
        }
    };
}
