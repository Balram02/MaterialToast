package com.balram.kukreja.materialtoast_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.balram.kukreja.materialtoast.MaterialToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button t1,t2,t3,t4,t5,t6,t7,t8;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        MaterialToast materialToast = new MaterialToast(MainActivity.this,MaterialToast.LENGTH_SHORT);
        if (id != -1){
            switch (v.getId()){
                case R.id.t1:
                    if (id==R.id.CSquare)
                        materialToast.createToast(MaterialToast.ERROR,"Error Toast",MaterialToast.SHAPE_SQUARE);
                    else
                        materialToast.createToast(MaterialToast.ERROR,"Error Toast",MaterialToast.SHAPE_DEFAULT);
                    break;
                case R.id.t2:
                    if (id==R.id.CSquare)
                        materialToast.createToast(MaterialToast.FAILURE,"Failure Toast",MaterialToast.SHAPE_SQUARE);
                    else
                        materialToast.createToast(MaterialToast.FAILURE,"Failure Toast",MaterialToast.SHAPE_DEFAULT);
                    break;
                case R.id.t3:
                    if (id==R.id.CSquare)
                        materialToast.createToast(MaterialToast.ALERT,"Alert Toast",MaterialToast.SHAPE_SQUARE);
                    else
                        materialToast.createToast(MaterialToast.ALERT,"Alert Toast",MaterialToast.SHAPE_DEFAULT);
                    break;
                case R.id.t4:
                    if (id==R.id.CSquare)
                        materialToast.createToast(MaterialToast.SUCCESS,"Success Toast",MaterialToast.SHAPE_SQUARE);
                    else
                        materialToast.createToast(MaterialToast.SUCCESS,"Success Toast",MaterialToast.SHAPE_DEFAULT);
                    break;
            }
            materialToast.show();
        }else {
            materialToast.createToast(MaterialToast.ALERT, "Please select any Toast shape", MaterialToast.SHAPE_DEFAULT);
            materialToast.show();
        }
    }
}
