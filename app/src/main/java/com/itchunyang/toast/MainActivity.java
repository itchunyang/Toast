package com.itchunyang.toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastLocation(View view) {
        Toast toast = Toast.makeText(this,"自定义toast",Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.BOTTOM,0,20);
        toast.setGravity(Gravity.TOP|Gravity.START,30,0);
        toast.show();
    }

    public void imageToast(View view) {
//        Toast toast = new Toast(this);
        Toast toast = Toast.makeText(this,"sasdfasdf",Toast.LENGTH_LONG);
        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.microsoft);
//        toast.setView(iv); //这么设置,那么只能显示一个imageview了

        LinearLayout linearLayout = (LinearLayout) toast.getView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.bottomMargin = 20;

        //默认是textview在上面,imageview在下面
//        linearLayout.addView(iv,layoutParams);

        linearLayout.addView(iv,0,layoutParams);
        toast.show();
    }

    public void myToast(View view) {
        ToastUtil.showToast(this,"Toast");
    }
}
