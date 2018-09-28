package com.balram.kukreja.materialtoast;

import android.content.Context;
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

    public final static int SHAPE_DEFAULT = 100;
    public final static int SHAPE_RECTANGLE = 101;
    public final static int SHAPE_MESSAGE_LEFT = 102;
    public final static int SHAPE_MESSAGE_RIGHT = 103;

    private Context context;

    private LinearLayout main_layout;

    public MaterialToast(Context context) {
        super(context);
        setDuration(Toast.LENGTH_SHORT);
    }

    public MaterialToast(Context context,int ToastLength) {
        super(context);
        this.context = context;
        setDuration(ToastLength);
    }

    public void createToast(int ToastType, String msgText, int ToastShape){
        GradientDrawable gd;
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.error_toast, null);
        main_layout = (LinearLayout) v.findViewById(R.id.main_layout);

        setToastShape(ToastShape);

        gd = ((GradientDrawable) main_layout.getBackground());

            switch (ToastType) {
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
                    v = View.inflate(context, R.layout.success_toast, null);
                    gd.setColor(context.getResources().getColor(R.color.success));
            }

        v.setBackground(gd);
        ((TextView) v.findViewById(R.id.text)).setText(msgText != null ? msgText : "Null");
        setView(v);
    }

    private void setToastShape(int ToastShape){

        switch (ToastShape){

            case SHAPE_RECTANGLE:
                main_layout.setBackgroundResource(R.drawable.shape_square);
                break;
            case SHAPE_DEFAULT:
                main_layout.setBackgroundResource(R.drawable.shape_default);
                break;
            case SHAPE_MESSAGE_LEFT:
                main_layout.setBackgroundResource(R.drawable.shape_message_left);
                break;
            case SHAPE_MESSAGE_RIGHT:
                main_layout.setBackgroundResource(R.drawable.shape_message_right);
                break;
        }
    }
}
