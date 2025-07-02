package java.com.example.figma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sarvatra2.R;

public class FrontPage extends AppCompatActivity {
    AppCompatButton appCompatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        appCompatButton = findViewById(R.id.signup);
        appCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrontPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}