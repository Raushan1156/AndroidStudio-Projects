package com.raushan.facedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.camerakit.CameraKitView;
import com.raushan.facedetection.Helper.GraphicOverlay;

import dmax.dialog.SpotsDialog;

public class MainActivity extends AppCompatActivity {

    private Button DetectFace;
    private GraphicOverlay graphic_overlay;
    private CameraKitView Camera_Button;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DetectFace=findViewById(R.id.DetectFace);
        graphic_overlay=findViewById(R.id.graphic_overlay);
        Camera_Button=findViewById(R.id.Camera_Button);

        alertDialog=new SpotsDialog.Builder()
                .setContext(this)
                .setMessage("Please Wait,Processing...")
                .setCancelable(false)
                .build();

        DetectFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Camera_Button.onStart();
                Camera_Button.captureImage();
                graphic_overlay.clear();
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Camera_Button.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Camera_Button.onStart();

    }
}