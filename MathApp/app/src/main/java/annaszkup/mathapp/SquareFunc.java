package annaszkup.mathapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SquareFunc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_func);

        Button calculateButton = (Button) findViewById(R.id.squareFunctionButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSquareFunction();
            }
        });
    }

    private void calculateSquareFunction() {
        EditText parameterAField = (EditText) findViewById(R.id.squareFirstParameterValue);
        EditText parameterBField = (EditText) findViewById(R.id.squareSecondParameterValue);
        EditText parameterCField = (EditText) findViewById(R.id.squareThirdParameterValue);
        TextView resultField = (TextView) findViewById(R.id.squareFunctionResultField);

        Float parameterAValue = Float.valueOf(parameterAField.getText().toString());
        Float parameterBValue = Float.valueOf(parameterBField.getText().toString());
        Float parameterCValue = Float.valueOf(parameterCField.getText().toString());

        Float deltaValue = (parameterBValue*parameterBValue)-4*(parameterAValue*parameterCValue);
        double firstXValue =  (-parameterBValue-Math.sqrt(deltaValue))/2*parameterAValue;
        double secondXValue = (-parameterBValue+Math.sqrt(deltaValue))/2*parameterAValue;
        if (deltaValue > 0) {
            resultField.setText(getResources().getString(R.string.squareFunctionResultPrefix) + " delta: " + deltaValue.toString() + ", x1: " + Math.round(firstXValue*100.0)/100.0 + ", x2: " + Math.round(secondXValue*100.0)/100.0);
        }
        else if (deltaValue == 0) {
            resultField.setText(getResources().getString(R.string.squareFunctionResultPrefix) + " delta: " + deltaValue.toString() + ", x0: " +  Math.round(firstXValue*100.0)/100.0);
        }
        else  {
            resultField.setText(getResources().getString(R.string.squareFunctionResultPrefix) + " delta: " + deltaValue.toString() + ", brak miejsc zerowych");
        }


    }
}

