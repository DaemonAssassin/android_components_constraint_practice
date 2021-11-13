package beast.mateenmehmood.constraintpractice;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ScrollViewActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout parent = new LinearLayout(this);
        Button btnCancel = new Button(this);
        Button btnSubmit = new Button(this);

        btnSubmit.setText("Submit");
        btnSubmit.setBackgroundResource(R.color.black);
        btnSubmit.setTextColor(Color.WHITE);
        btnSubmit.setPadding(20, 10, 20, 10);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, 0, 50, 0);
        btnSubmit.setLayoutParams(params);

        btnSubmit.setTextSize(24);

        btnCancel.setText("Cancel");
        btnCancel.setTextSize(24);

        parent.setOrientation(LinearLayout.HORIZONTAL);
        parent.setPadding(20, 20, 20, 20);
        parent.setGravity(Gravity.CENTER);

        parent.addView(btnSubmit);
        parent.addView(btnCancel);

        setContentView(parent);
    }
}