package com.example.avatarcreator;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mLink = (TextView) findViewById(R.id.textView);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void openCamera(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CameraView.class);
        //Aixó es farà servir en cas de recollir text (edat...)
        // EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        ///////Per obtinr coses de la camara abans de ferla servir:
        // CameraManager manager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

    }

    /*public void MovementMethod() {
        TextView mLink = (TextView) findViewById(R.id.textView);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }*/
}
