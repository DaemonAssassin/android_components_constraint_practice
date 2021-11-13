package beast.mateenmehmood.constraintpractice;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.snackbar.Snackbar;

public class SnackBar extends AppCompatActivity {
    Button btnClick;
    ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);

        btnClick = findViewById(R.id.btnClick);
        parent = findViewById(R.id.parentLayout);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(parent, "Thanks for Subscribing", Snackbar.LENGTH_INDEFINITE).
                        setTextColor(getResources().getColor(R.color.purple_200)).setBackgroundTint(Color.RED).
                        setAction("Unsubscribe", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast toast = Toast.makeText(SnackBar.this, "You have unsub", Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        }).setActionTextColor(Color.WHITE).show();
            }
        });
    }
}