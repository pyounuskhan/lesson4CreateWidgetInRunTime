package ifirst.co.lesson4createwidgetinruntime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.layout);
        DatePicker datePicker = new DatePicker(this);
        layout.addView(datePicker);

//        @Override protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            RelativeLayout layout = new RelativeLayout(this);
//            DatePicker datePicker = new DatePicker(this);
//            layout.addView(datePicker);
//            setContentView(layout);
//        }

    }
}
