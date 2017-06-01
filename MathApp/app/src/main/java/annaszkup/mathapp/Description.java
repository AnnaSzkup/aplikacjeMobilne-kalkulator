package annaszkup.mathapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent intent = getIntent();
        int desctiptionKey = intent.getIntExtra("stringValue", 0);

        TextView container = (TextView) findViewById(R.id.descriptionTextContent);
        container.setText(desctiptionKey);
    }
}
