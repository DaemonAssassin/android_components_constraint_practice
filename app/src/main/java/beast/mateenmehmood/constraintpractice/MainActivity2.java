package beast.mateenmehmood.constraintpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    public static final String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView_click);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        //TODO: remove the log here
        Log.w(TAG, "onCreate method called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w(TAG, "onStart method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG, "onResume method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "onPause method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "onStop method called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG, "onRestart method called");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.w(TAG, "onSaveInstanceState method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG, "onDestroy method called");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.w(TAG, "onRestoreInstanceState method called");
    }
}