package com.example.caova.application;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity  {
   private ImageView imghome,imgcuochen,imgtiepnhan,imgtuvan,imgbaogia,imgtiendo,imggiaoxe;
   private TextView tvhome,tvcuochen,tvtiepnhan,tvtuvan,tvbaogia,tvtiendo,tvgiaoxe;
   private LinearLayout llhome,llcuochen,lltiepnhan,lltuvan,llbaogia,lltiendo,llgiaoxe;
   private int index ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        imghome =findViewById(R.id.img_home);
        imgcuochen=findViewById(R.id.img_cuochen_navi);
        imgtiepnhan=findViewById(R.id.img_tiepnhan_navi);
        imgtuvan = findViewById(R.id.img_tuvan_navi);
        imgbaogia = findViewById(R.id.img_baogia);
        imgtiendo = findViewById(R.id.img_tiendo_navi);
        imggiaoxe = findViewById(R.id.img_giaoxe);

        tvhome = findViewById(R.id.tv_home);
        tvcuochen = findViewById(R.id.tv_cuochen_navi);
        tvtiepnhan = findViewById(R.id.tv_tiepnhan_navi);
        tvtuvan = findViewById(R.id.tv_tuvan_navi);
        tvbaogia = findViewById(R.id.tv_baogia);
        tvtiendo = findViewById(R.id.tv_tiendo_navi);
        tvgiaoxe = findViewById(R.id.tv_giaoxe_navi);

        llhome = findViewById(R.id.ll_home);
        llcuochen = findViewById(R.id.ll_cuochen);
        lltiepnhan = findViewById(R.id.ll_tiepnhan);
        lltuvan = findViewById(R.id.ll_tuvan);
        llbaogia = findViewById(R.id.ll_baogia);
        lltiendo = findViewById(R.id.ll_tiendo_navi);
        llgiaoxe = findViewById(R.id.ll_giaoxe);
    }

    @OnClick(R.id.ll_home)
    public void onHomeClick(View view) {
        setbgdark(index);
        index=0;
        onClick(index);
    }

    @OnClick(R.id.ll_cuochen)
    public void onAppointmentClick(View view){
        setbgdark(index);
        index=1;
        onClick(index);
    }

    @OnClick(R.id.ll_tiepnhan)
    public void onReceiveClick(View view){
            setbgdark(index);
            index = 2;
            onClick(index);
    }

    @OnClick(R.id.ll_tuvan)
    public void onAdvisoryClick(View view){
        setbgdark(index);
        index = 3;
        onClick(index);
    }

    @OnClick(R.id.ll_baogia)
    public void onQuotesClick(View view){
        setbgdark(index);
        index = 4;
        onClick(index);
    }

    @OnClick(R.id.ll_tiendo_navi)
    public void onProgressClick(View view){
        setbgdark(index);
        index = 5;
        onClick(index);
    }

    @OnClick(R.id.ll_giaoxe)
    public void onVehicleHandingClick(View view){
        setbgdark(index);
        index = 6;
        onClick(index);
    }



    public void onClick(int index){
        switch (index){
            case 0:
                llhome.setBackgroundColor(getResources().getColor(R.color.colorText));
                imghome.setImageDrawable(getResources().getDrawable(R.drawable.home_black));
                tvhome.setTextColor(getResources().getColor(R.color.colorBackGroundNavi));
                break;
            case 1:
                llcuochen.setBackgroundColor(getResources().getColor(R.color.colorText));
                imgcuochen.setImageDrawable(getResources().getDrawable(R.drawable.cuochen_black));
                tvcuochen.setTextColor(getResources().getColor(R.color.colorBackGroundNavi));
                break;
            case 2:
                lltiepnhan.setBackgroundColor(getResources().getColor(R.color.colorText));
                imgtiepnhan.setImageDrawable(getResources().getDrawable(R.drawable.tiepnhanvagiaoxe_black));
                tvtiepnhan.setTextColor(getResources().getColor(R.color.colorBackGroundNavi));
                break;
            case 3:
                lltuvan.setBackgroundColor(getResources().getColor(R.color.colorText));
                imgtuvan.setImageDrawable(getResources().getDrawable(R.drawable.tuvan_black));
                tvtuvan.setTextColor(getResources().getColor(R.color.colorBackGroundNavi));
                break;
            case 4:
                llbaogia.setBackgroundColor(getResources().getColor(R.color.colorText));
                imgbaogia.setImageDrawable(getResources().getDrawable(R.drawable.baogia_black));
                tvbaogia.setTextColor(getResources().getColor(R.color.colorBackGroundNavi));
                break;
            case 5:
                lltiendo.setBackgroundColor(getResources().getColor(R.color.colorText));
                imgtiendo.setImageDrawable(getResources().getDrawable(R.drawable.theodoitiendo_black));
                tvtiendo.setTextColor(getResources().getColor(R.color.colorBackGroundNavi));
                break;
            case 6:
                llgiaoxe.setBackgroundColor(getResources().getColor(R.color.colorText));
                imggiaoxe.setImageDrawable(getResources().getDrawable(R.drawable.giaoxe_black));
                tvgiaoxe.setTextColor(getResources().getColor(R.color.colorBackGroundNavi));
                break;
        }
    }


    public void setbgdark(int index){
        switch (index){
            case 0:
                llhome.setBackgroundColor(getResources().getColor(R.color.colorBackGroundNavi));
                imghome.setImageDrawable(getResources().getDrawable(R.drawable.home));
                tvhome.setTextColor(getResources().getColor(R.color.colorText));
                break;
            case 1:
                llcuochen.setBackgroundColor(getResources().getColor(R.color.colorBackGroundNavi));
                imgcuochen.setImageDrawable(getResources().getDrawable(R.drawable.cuochen));
                tvcuochen.setTextColor(getResources().getColor(R.color.colorText));
                break;
            case 2:
                lltiepnhan.setBackgroundColor(getResources().getColor(R.color.colorBackGroundNavi));
                imgtiepnhan.setImageDrawable(getResources().getDrawable(R.drawable.tiepnhanvagiaoxe));
                tvtiepnhan.setTextColor(getResources().getColor(R.color.colorText));
                break;
            case 3:
                lltuvan.setBackgroundColor(getResources().getColor(R.color.colorBackGroundNavi));
                imgtuvan.setImageDrawable(getResources().getDrawable(R.drawable.tuvan));
                tvtuvan.setTextColor(getResources().getColor(R.color.colorText));
                break;
            case 4:
                llbaogia.setBackgroundColor(getResources().getColor(R.color.colorBackGroundNavi));
                imgbaogia.setImageDrawable(getResources().getDrawable(R.drawable.baogia));
                tvbaogia.setTextColor(getResources().getColor(R.color.colorText));
                break;
            case 5:
                lltiendo.setBackgroundColor(getResources().getColor(R.color.colorBackGroundNavi));
                imgtiendo.setImageDrawable(getResources().getDrawable(R.drawable.theoidoiriendo));
                tvtiendo.setTextColor(getResources().getColor(R.color.colorText));
                break;
            case 6:
                llgiaoxe.setBackgroundColor(getResources().getColor(R.color.colorBackGroundNavi));
                imggiaoxe.setImageDrawable(getResources().getDrawable(R.drawable.giaoxe));
                tvgiaoxe.setTextColor(getResources().getColor(R.color.colorText));
                break;
        }
    }
}




