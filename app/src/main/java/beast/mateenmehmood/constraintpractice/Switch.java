package beast.mateenmehmood.constraintpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

public class Switch extends AppCompatActivity {
    SwitchCompat switchCompat;
    ConstraintLayout layout;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        switchCompat = findViewById(R.id.switch_power);
        layout = findViewById(R.id.main_layout);

        switchCompat.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Toast toast;
            if (isChecked) {
                toast = Toast.makeText(Switch.this, "Switch is ON", Toast.LENGTH_SHORT);
                layout.setBackgroundResource(R.color.black);
            } else {
                toast = Toast.makeText(Switch.this, "Switch is OFF", Toast.LENGTH_SHORT);
                layout.setBackgroundResource(R.color.teal_200);
            }
            toast.show();
        });
    }
}