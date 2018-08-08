package com.balram.kukreja.materialtoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MaterialToast extends Toast{

    public final static int FAILURE = -1;
    public final static int ALERT = 0;
    public final static int ERROR = 1;
    public final static int SUCCESS = 2;

    public final static int SHAPE_DEFAULT = 0;
    public final static int SHAPE_SQUARE = 1;

    private Context context;
    private int ToastLength = Toast.LENGTH_SHORT;
    private int ToastType = 0;
    int ToastShape = 0;

    private View v;

    public MaterialToast(Context context,int ToastLength) {
        super(context);
        this.context = context;
        this.ToastLength = ToastLength;
        setDuration(this.ToastLength);
    }

    public void createToast(int ToastType, String CustomText, int ToastShape){
        GradientDrawable gd;
        v = LayoutInflater.from(context).inflate(R.layout.error_toast, null);
        LinearLayout main_layout = (LinearLayout) v.findViewById(R.id.main_layout);
        if (ToastShape == SHAPE_SQUARE)
            main_layout.setBackgroundResource(R.drawable.square_back);
        else
            main_layout.setBackgroundResource(R.drawable.oval_back);

        gd = ((GradientDrawable) main_layout.getBackground());

        switch (ToastType){
            case ERROR:
                v = View.inflate(context, R.layout.error_toast, null);
                gd.setColor(context.getResources().getColor(R.color.error));
                break;
            case FAILURE:
                v = View.inflate(context, R.layout.failure_toast, null);
                gd.setColor(context.getResources().getColor(R.color.failure));
                break;
            case ALERT:
                v = View.inflate(context, R.layout.alert_toast, null);
                gd.setColor(context.getResources().getColor(R.color.alert));
                break;
            case SUCCESS:
                v = View.inflate(context, R.layout.success_toast, null);
                gd.setColor(context.getResources().getColor(R.color.success));
                break;
            default:
                v = View.inflate(context, R.layout.error_toast, null);
                gd.setColor(context.getResources().getColor(R.color.error));
        }
        v.setBackground(gd);
        ((TextView) v.findViewById(R.id.text)).setText(CustomText != null ? CustomText : "Null");
        setView(v);
    }

    public MaterialToast(Context context) {
        super(context);
    }
}




















/*
            switch (ToastShape) {
                case SHAPE_DEFAULT:
                    main_layout.setBackgroundResource(R.drawable.oval_back);
                    break;
                case SHAPE_SQUARE:
                    main_layout.setBackgroundResource(R.drawable.square_back);
                    break;
                default:
                    main_layout.setBackgroundResource(R.drawable.oval_back);
                    break;
            }
            gd = ((GradientDrawable) main_layout.getBackground());

        switch (ToastType) {
            case ERROR:
                v = View.inflate(context, R.layout.error_toast, null);
                ((TextView) v.findViewById(R.id.text)).setText(CustomText != null ? CustomText : "Null");
                gd.setColor(context.getResources().getColor(R.color.error));
                break;
            case ALERT:
                v = View.inflate(context, R.layout.alert_toast, null);
                ((TextView) v.findViewById(R.id.text)).setText(CustomText != null ? CustomText : "Null");
                gd.setColor(context.getResources().getColor(R.color.alert));
                break;
            case SUCCESS:
                v = View.inflate(context, R.layout.success_toast, null);
                ((TextView) v.findViewById(R.id.text)).setText(CustomText != null ? CustomText : "Null");
                gd.setColor(context.getResources().getColor(R.color.success));
                break;
            case FAILURE:
                v = View.inflate(context, R.layout.failure_toast, null);
                ((TextView) v.findViewById(R.id.text)).setText(CustomText != null ? CustomText : "Null");
                gd.setColor(context.getResources().getColor(R.color.failure));
                break;
            default:
                v = View.inflate(context, R.layout.failure_toast, null);
                ((TextView) v.findViewById(R.id.text)).setText(CustomText != null ? CustomText : "Null");
                gd.setColor(context.getResources().getColor(R.color.purple));
                break;
        }
        main_layout.setBackground(gd);
*/
