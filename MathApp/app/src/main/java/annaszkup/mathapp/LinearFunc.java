package annaszkup.mathapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearFunc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_func);

        Button calculateButton = (Button) findViewById(R.id.linearFunctionButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateLinearFunction();
            }
        });
    }

    private void calculateLinearFunction() {
        EditText parameterAField = (EditText) findViewById(R.id.linearFirstParameterValue);
        EditText parameterBField = (EditText) findViewById(R.id.linearSecondParameterValue);
        TextView resultField = (TextView) findViewById(R.id.linearFunctionResultField);

        Float parameterAValue = Float.valueOf(parameterAField.getText().toString());
        Float parameterBValue = Float.valueOf(parameterBField.getText().toString());

        Float resultValue = (-parameterBValue / parameterAValue);
        resultField.setText(getResources().getString(R.string.linearFunctionResultPrefix)+resultValue.toString());



    }
}
