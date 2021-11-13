package beast.mateenmehmood.constraintpractice;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class BtnOnClick implements View.OnClickListener {
    Context mContext;
    
    BtnOnClick (Context context) {
        mContext = context;
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(mContext, "Mateen", Toast.LENGTH_SHORT).show();
    }
}
