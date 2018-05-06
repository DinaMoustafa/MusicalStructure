package com.example.dina.musicalstructure;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton classicalImageButton = findViewById(R.id.classical_image_button);
        classicalImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                startActivity(myIntent);
            }
        });
        ImageButton hipHopImageButton = findViewById(R.id.hip_hop_image_button);
        hipHopImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, HipHopActivity.class);
                startActivity(myIntent);
            }
        });
        ImageButton jazzImageButton = findViewById(R.id.jazz_image_button);
        jazzImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(myIntent);
            }
        });
        ImageButton reggaeImageButton = findViewById(R.id.reggae_image_button);
        reggaeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, ReggaeActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
