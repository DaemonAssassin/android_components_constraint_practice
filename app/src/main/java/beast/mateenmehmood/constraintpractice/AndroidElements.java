package beast.mateenmehmood.constraintpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class AndroidElements extends AppCompatActivity {
    ToggleButton button;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_elements);

        button = findViewById(R.id.toggle_btn);

        button.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(AndroidElements.this, "Button is ON", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(AndroidElements.this, "Button is OFF", Toast.LENGTH_SHORT).show();
        });
    }
}