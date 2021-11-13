package beast.mateenmehmood.constraintpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.snackbar.Snackbar;

public class SnackBarDialog extends AppCompatActivity {
    Button snackBar, dialog;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar_dialog);

        snackBar = findViewById(R.id.snackbar_btn);
        dialog = findViewById(R.id.dialog_btn);
        layout = findViewById(R.id.constraint_layout);

        snackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(SnackBarDialog.this, layout, "Thanks for subs", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}