package annaszkup.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtonListeners();
    }

    private void setButtonListeners() {
        Button calcButton = (Button) findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcButtonOnClick(v);
            }
        });

        calcButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                calcButtonOnLongClick(v);
                return false;
            }
        });


        Button linearFuncButton = (Button) findViewById(R.id.linearFuncButton);
        linearFuncButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearFuncButtonOnClick(v);
            }
        });

        linearFuncButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                linearFuncButtonOnLongClick(v);
                return false;
            }
        });


        Button squareFuncButton = (Button) findViewById(R.id.squareFuncButton);
        squareFuncButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squareFuncButtonOnClick(v);
            }
        });

        squareFuncButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                squareFuncButtonOnLongClick(v);
                return false;
            }
        });


        Button aboutButton = (Button) findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutButtonOnClick(v);
            }
        });
    }

    public void calcButtonOnClick(View v) {
         startActivity(new Intent(MainActivity.this, CalcActivity.class));
    }

    public void calcButtonOnLongClick(View v) {

    }

    public void linearFuncButtonOnClick(View v) {
        startActivity(new Intent(MainActivity.this, LinearFuncActivity.class));
    }

    public void linearFuncButtonOnLongClick(View v) {

    }

    public void squareFuncButtonOnClick(View v) {
        startActivity(new Intent(MainActivity.this, SquareFuncActivity.class));
    }

    public void squareFuncButtonOnLongClick(View v) {

    }

    public void aboutButtonOnClick(View v) {
        startActivity(new Intent(MainActivity.this, AboutActivity.class));
    }
}
