package com.balram.kukreja.materialtoast_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.balram.kukreja.materialtoast.MaterialToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button t1,t2,t3,t4;

        t1 = (Button)findViewById(R.id.t1);
        t2 = (Button)findViewById(R.id.t2);
        t3 = (Button)findViewById(R.id.t3);
        t4 = (Button)findViewById(R.id.t4);

        radioGroup = (RadioGroup)findViewById(R.id.rGroup);

        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = radioGroup.getCheckedRadioButtonId();
        MaterialToast materialToast = new MaterialToast(MainActivity.this, MaterialToast.LENGTH_SHORT);

        String msg;

        if (id != -1){
            switch (v.getId()){
                case R.id.t1:
                    msg = "Error Toast";
                    switch (id){
                        case R.id.CSquare:
                            materialToast.createToast(MaterialToast.ERROR,msg,MaterialToast.SHAPE_RECTANGLE);
                            break;
                        case R.id.CDefault:
                            materialToast.createToast(MaterialToast.ERROR,msg,MaterialToast.SHAPE_DEFAULT);
                            break;
                        case R.id.CLeftMessage:
                            materialToast.createToast(MaterialToast.ERROR,msg,MaterialToast.SHAPE_MESSAGE_LEFT);
                            break;
                        case R.id.CRightMessage:
                            materialToast.createToast(MaterialToast.ERROR,msg,MaterialToast.SHAPE_MESSAGE_RIGHT);
                    }
                    break;
                case R.id.t2:
                    msg = "Failure Toast";
                    switch (id){
                        case R.id.CSquare:
                            materialToast.createToast(MaterialToast.FAILURE,msg,MaterialToast.SHAPE_RECTANGLE);
                            break;
                        case R.id.CDefault:
                            materialToast.createToast(MaterialToast.FAILURE,msg,MaterialToast.SHAPE_DEFAULT);
                            break;
                        case R.id.CLeftMessage:
                            materialToast.createToast(MaterialToast.FAILURE,msg,MaterialToast.SHAPE_MESSAGE_LEFT);
                            break;
                        case R.id.CRightMessage:
                            materialToast.createToast(MaterialToast.FAILURE,msg,MaterialToast.SHAPE_MESSAGE_RIGHT);
                    }
                    break;
                case R.id.t3:
                    msg = "Alert Toast";
                    switch (id){
                        case R.id.CSquare:
                            materialToast.createToast(MaterialToast.ALERT,msg,MaterialToast.SHAPE_RECTANGLE);
                            break;
                        case R.id.CDefault:
                            materialToast.createToast(MaterialToast.ALERT,msg,MaterialToast.SHAPE_DEFAULT);
                            break;
                        case R.id.CLeftMessage:
                            materialToast.createToast(MaterialToast.ALERT,msg,MaterialToast.SHAPE_MESSAGE_LEFT);
                            break;
                        case R.id.CRightMessage:
                            materialToast.createToast(MaterialToast.ALERT,msg,MaterialToast.SHAPE_MESSAGE_RIGHT);
                    }
                    break;
                case R.id.t4:
                    msg = "Success Toast";
                    switch (id){
                        case R.id.CSquare:
                            materialToast.createToast(MaterialToast.SUCCESS,msg,MaterialToast.SHAPE_RECTANGLE);
                            break;
                        case R.id.CDefault:
                            materialToast.createToast(MaterialToast.SUCCESS,msg,MaterialToast.SHAPE_DEFAULT);
                            break;
                        case R.id.CLeftMessage:
                            materialToast.createToast(MaterialToast.SUCCESS,msg,MaterialToast.SHAPE_MESSAGE_LEFT);
                            break;
                        case R.id.CRightMessage:
                            materialToast.createToast(MaterialToast.SUCCESS,msg,MaterialToast.SHAPE_MESSAGE_RIGHT);
                    }
                    break;
            }
            materialToast.show();
        }else {
            msg = "Please select any Toast shape";
            materialToast.createToast(MaterialToast.ALERT, msg, MaterialToast.SHAPE_DEFAULT);
            materialToast.show();
        }
    }
}
