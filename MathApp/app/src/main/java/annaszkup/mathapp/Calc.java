package annaszkup.mathapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calc extends AppCompatActivity {
    private int calcFirstParam = 0;
    private int calcSecondParam = 0;
    private String operationType;
    private String calcString = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        setOnclickListeners();
        setResultFieldContent(calcString);
    }

    private void setOnclickListeners() {
        Button oneButton = (Button) findViewById(R.id.oneCalcButton);
        Button twoButton = (Button) findViewById(R.id.twoCalcButton);
        Button threeButton = (Button) findViewById(R.id.threeCalcButton);
        Button fourButton = (Button) findViewById(R.id.fourCalcButton);
        Button fiveButton = (Button) findViewById(R.id.fiveCalcButton);
        Button sixButton = (Button) findViewById(R.id.sixCalcButton);
        Button sevenButton = (Button) findViewById(R.id.sevenCalcButton);
        Button eightButton = (Button) findViewById(R.id.eightCalcButton);
        Button nineButton = (Button) findViewById(R.id.nineCalcButton);
        Button zeroButton = (Button) findViewById(R.id.zeroCalcButton);
        Button addButton = (Button) findViewById(R.id.addCalcButton);
        Button substractButton = (Button) findViewById(R.id.substractCalcButton);
        Button multiplyButton = (Button) findViewById(R.id.multiplyCalcButton);
        Button divideButton = (Button) findViewById(R.id.divideCalcButton);
        Button squareButton = (Button) findViewById(R.id.squareCalcButton);
        Button rootButton = (Button) findViewById(R.id.rootCalcButton);
        Button clearButton = (Button) findViewById(R.id.clearCalcButton);
        Button resultButton = (Button) findViewById(R.id.resultCalcButton);


        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneButtonOnClick();
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoButtonOnClick();
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threeButtonOnClick();
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourButtonOnClick();
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiveButtonOnClick();
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixButtonOnClick();
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sevenButtonOnClick();
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eightButtonOnClick();
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nineButtonOnClick();
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zeroButtonOnClick();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addButtonOnClick();
            }
        });

        substractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                substractButtonOnClick();
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplyButtonOnClick();
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divideButtonOnClick();
            }
        });

        squareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                squareButtonOnClick();
            }
        });

        rootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootButtonOnClick();
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearButtonOnClick();
            }
        });

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultButtonOnClick();
            }
        });

    }

    private void oneButtonOnClick() {
       if(calcString == "0") {
           calcString = "1";
       } else {
           calcString += "1";
       }
       setResultFieldContent(calcString);
    }

    private void twoButtonOnClick() {
        if(calcString == "0") {
            calcString = "2";
        } else {
            calcString += "2";
        }
        setResultFieldContent(calcString);
    }

    private void threeButtonOnClick() {
        if(calcString == "0") {
            calcString = "3";
        } else {
            calcString += "3";
        }
        setResultFieldContent(calcString);
    }

    private void fourButtonOnClick() {
        if(calcString == "0") {
            calcString = "4";
        } else {
            calcString += "4";
        }
        setResultFieldContent(calcString);
    }

    private void fiveButtonOnClick() {
        if(calcString == "0") {
            calcString = "5";
        } else {
            calcString += "5";
        }
        setResultFieldContent(calcString);
    }

    private void sixButtonOnClick() {
        if(calcString == "0") {
            calcString = "6";
        } else {
            calcString += "6";
        }
        setResultFieldContent(calcString);
    }

    private void sevenButtonOnClick() {
        if(calcString == "0") {
            calcString = "7";
        } else {
            calcString += "7";
        }
        setResultFieldContent(calcString);
    }
    private void eightButtonOnClick() {
        if(calcString == "0") {
            calcString = "8";
        } else {
            calcString += "8";
        }
        setResultFieldContent(calcString);
    }

    private void nineButtonOnClick() {
        if(calcString == "0") {
            calcString = "9";
        } else {
            calcString += "9";
        }
        setResultFieldContent(calcString);
    }

    private void zeroButtonOnClick() {
        if(calcString == "0") {
            calcString = "0";
        } else {
            calcString += "0";
        }
        setResultFieldContent(calcString);
    }

    private void addButtonOnClick() {
        operationType = "ADD";
        calcFirstParam = Integer.valueOf(calcString);
        calcString = String.valueOf(calcFirstParam)+"+";
        setResultFieldContent(calcString);
    }

    private void substractButtonOnClick() {
        operationType = "SUBSTRACT";
        calcFirstParam = Integer.valueOf(calcString);
        calcString = String.valueOf(calcFirstParam)+"-";
        setResultFieldContent(calcString);
    }

    private void multiplyButtonOnClick() {
        operationType = "MULTIPLY";
        calcFirstParam = Integer.valueOf(calcString);
        calcString = String.valueOf(calcFirstParam)+"*";
        setResultFieldContent(calcString);
    }
    private void divideButtonOnClick() {
        operationType = "DIVIDE";
        calcFirstParam = Integer.valueOf(calcString);
        calcString = String.valueOf(calcFirstParam)+"/";
        setResultFieldContent(calcString);
    }

    private void squareButtonOnClick() {
        operationType = "SQUARE";
        calcFirstParam = Integer.valueOf(calcString);
        calcString = String.valueOf(calcFirstParam)+"^";
        setResultFieldContent(calcString);
    }

    private void rootButtonOnClick() {
        operationType = "ROOT";
        calcFirstParam = Integer.valueOf(calcString);
        calcString = String.valueOf(Math.sqrt(calcFirstParam));
        setResultFieldContent("√"+calcString);
    }

    private void clearButtonOnClick() {
        calcString = "0";
        calcFirstParam = 0;
        calcSecondParam = 0;
        setResultFieldContent(calcString);
    }
    private void resultButtonOnClick() {
        int calcResult = 0;
        int index = 0;
        switch(operationType) {
            case "ADD":
                index = calcString.indexOf("+");
                calcSecondParam = Integer.valueOf(calcString.substring(++index));
                calcResult = calcFirstParam + calcSecondParam;
                calcString = String.valueOf(calcResult);
                setResultFieldContent(calcString);
                break;
            case "SUBSTRACT":
                index = calcString.indexOf("-");
                calcSecondParam = Integer.valueOf(calcString.substring(++index));
                calcResult = calcFirstParam - calcSecondParam;
                calcString = String.valueOf(calcResult);
                setResultFieldContent(calcString);
                break;
            case "MULTIPLY":
                index = calcString.indexOf("*");
                calcSecondParam = Integer.valueOf(calcString.substring(++index));
                calcResult = calcFirstParam * calcSecondParam;
                calcString = String.valueOf(calcResult);
                setResultFieldContent(calcString);
                break;
            case "DIVIDE":
                index = calcString.indexOf("/");
                calcSecondParam = Integer.valueOf(calcString.substring(++index));
                calcResult = calcFirstParam / calcSecondParam;
                calcString = String.valueOf(calcResult);
                setResultFieldContent(calcString);
                break;
            case "SQUARE":
                index = calcString.indexOf("^");
                calcSecondParam = Integer.valueOf(calcString.substring(++index));
                calcResult = ((int) Math.pow(calcFirstParam, calcSecondParam));
                calcString = String.valueOf(calcResult);
                setResultFieldContent(calcString);
                break;
            default:
                break;
        }
    }

    private void setResultFieldContent(String content) {
        EditText calcResultField = (EditText) findViewById(R.id.calcOutputField);
        calcResultField.setText(content);
    }
}
