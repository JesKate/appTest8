package com.example.mycolorsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    //1.instancear los ids del formulario de diseño xml
    private SeekBar sbrRed=null;
    private SeekBar sbrGreen=null;
    private SeekBar sbrBlue=null;
    private SeekBar sbrAlpha=null;
    private View vieColors=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.Obtener ids del formulario de diseño xml
        sbrRed=findViewById(R.id.sbrRed);
        sbrGreen=findViewById(R.id.sbrGreen);
        sbrBlue=findViewById(R.id.sbrBlue);
        sbrAlpha=findViewById(R.id.sbrAlpha);
        vieColors=findViewById(R.id.vieColors);

        //3. set SeekBar change on moving
        sbrRed.setOnSeekBarChangeListener(this);
        sbrGreen.setOnSeekBarChangeListener(this);
        sbrBlue.setOnSeekBarChangeListener(this);
        sbrAlpha.setOnSeekBarChangeListener(this);

        //4. enable contextmenu on view component (habilitar el touch de la imagen)
        registerForContextMenu(vieColors);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean u) {
        int r= sbrRed.getProgress();
        int g= sbrGreen.getProgress();
        int b= sbrBlue.getProgress();
        int a= sbrAlpha.getProgress();
        
        int color= Color.argb(a,r,g,b);
        vieColors.setBackgroundColor(color);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
