package org.bubulescu.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bPrvi;
    private Button bDrugi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bPrvi = findViewById(R.id.bPrvi);
        bDrugi = findViewById(R.id.bDrugi);

        bPrvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Kliknut prvi button!", Toast.LENGTH_LONG).show();
            }
        });
        
        bDrugi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Marijo Novosel", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
