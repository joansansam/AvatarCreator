package com.example.avatarcreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;

public class DetailActivity extends AppCompatActivity {

    private TextureView textureView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Mirar de posar aqui la foto guardada (es pot canviar per ImageView si no va)
        //Que passa amb textureListener

        textureView = (TextureView) findViewById(R.id.preview);
        assert textureView != null;
        textureView.setSurfaceTextureListener(textureListener);
    }
}
