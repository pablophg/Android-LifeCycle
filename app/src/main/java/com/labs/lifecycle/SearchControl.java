package com.labs.lifecycle;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


public class SearchControl extends LinearLayout{
    public SearchControl(Context context) {
        super(context);
        loadLayout();
    }

    public SearchControl(Context context, AttributeSet attrs) {
        super(context, attrs);
        loadLayout();
    }

    public SearchControl(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        loadLayout();
    }

    private void loadLayout()
    {
        Button btn_buscar = null;
        EditText et_texto = null;

        LayoutInflater.from(this.getContext()).inflate(R.layout.search_control, this, true);

        btn_buscar = (Button) findViewById(R.id.button);
        et_texto = (EditText) findViewById(R.id.editText2);

        btn_buscar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onClick", "Se ha pulsado el boton buscar");
            }
        });
    }
}
