package gsachs.simplxl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.NUMBERS);
        String operation = intent.getStringExtra(MainActivity.OPERATION);

        String result = calculateResult(message, operation);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(result);
        setContentView(textView);
    }


    private String calculateResult(String message, String operation) {

        String[] numbers = message.split("\n");
        String result = "";

        Integer sum = 0;


        if (MainActivity.ADD.equals(operation)) {

            for (String num : numbers) {
                sum += new Integer(num);
            }
        } else if (MainActivity.AVERAGE.equals(operation)) {
            for (String num : numbers) {
                sum += new Integer(num);
            }
            Integer avg = sum / numbers.length;
            sum = avg;
        } else if (MainActivity.DIVIDE.equals(operation)) {
            for (String num : numbers) {
                sum += new Integer(num);
            }

            Integer finalNum = new Integer(numbers[numbers.length - 1]);
            sum = (sum - finalNum) / finalNum;

        } else {
            //result = "No luck today :(";
        }

        return sum.toString();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
        return true;
    }
}
