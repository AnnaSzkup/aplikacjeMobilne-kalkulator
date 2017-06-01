package annaszkup.mathapp;

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
        setButtonOnClickListeners();
    }

    private void setButtonOnClickListeners() {
        Button calcButton = (Button) findViewById(R.id.calcButton);
        Button linearFuncButton = (Button) findViewById(R.id.linearFuncButton);
        Button squareFuncButton = (Button) findViewById(R.id.squareFuncButton);
        Button aboutButton = (Button) findViewById(R.id.aboutButton);

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

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutButtonOnClick(v);
            }
        });

    }

    private void calcButtonOnClick(View v) {
        Intent intent = new Intent(this, Calc.class);
        startActivity(intent);
    }

    private void calcButtonOnLongClick(View v) {
        Intent intent = new Intent(this, Description.class);
        intent.putExtra("stringValue", R.string.calcDescriptionText);
        startActivity(intent);
    }

    private void linearFuncButtonOnClick(View v) {
        Intent intent = new Intent(this, LinearFunc.class);
        startActivity(intent);
    }

    private void linearFuncButtonOnLongClick(View v) {
        Intent intent = new Intent(this, Description.class);
        intent.putExtra("stringValue", R.string.linearFuncDescriptionText);
        startActivity(intent);
    }

    private void squareFuncButtonOnClick(View v) {
        Intent intent = new Intent(this, SquareFunc.class);
        startActivity(intent);
    }

    private void squareFuncButtonOnLongClick(View v) {
        Intent intent = new Intent(this, Description.class);
        intent.putExtra("stringValue", R.string.squareFuncDescriptionText);
        startActivity(intent);
    }

    private void aboutButtonOnClick(View v) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}
