package kr.hs.emirimw2016.projects4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlus = findViewById(R.id.btn1);
        Button btnMinus = findViewById(R.id.btn2);
        Button btnMulti = findViewById(R.id.btn3);
        Button btnDiv = findViewById(R.id.btn4);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        textResult = findViewById(R.id.t1);

        btnPlus.setOnClickListener(btnListener);
        btnMinus.setOnClickListener(btnListener);
        btnMulti.setOnClickListener(btnListener);
        btnDiv.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View v) {
            String strEdit1 = edit1.getText().toString();
            String strEdit2 = edit2.getText().toString();
            int num1 = Integer.parseInt(strEdit1);
            int num2 = Integer.parseInt(strEdit2);
            int result = 0;
            switch (v.getId()){
                case R.id.btn1:
                    result = num1 + num2;
                    break;
                case R.id.btn2:
                    result = num1 - num2;
                    break;
                case R.id.btn3:
                    result = num1 * num2;
                    break;
                case R.id.btn4:
                    result = num1 / num2;
                    break;
            }
            textResult.setText(R.string.t1);
            textResult.append(result + "");
        }
    };
}