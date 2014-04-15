import com.positioningsensoridentification.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
 
public class HelloWorkshopActivity extends Activity
        implements OnClickListener {
 
    private Button hiButton;
    private Button helloButton;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        hiButton = (Button) findViewById(R.id.hi_button);
        hiButton.setOnClickListener(this);

        helloButton = (Button) findViewById(R.id.hello_button);
        helloButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
 
        String name = nameField.getText().toString();
 
        if (name.length() == 0) {
            new AlertDialog.Builder(this).setMessage(
                    R.string.error_name_missing).setNeutralButton(
                    R.string.error_ok,
                    null).show();
            return;
        }

        if (v == hiButton || v == helloButton) {
            int resourceId = v == hiButton ? R.string.hi_greeting
                    : R.string.hello_greeting;

            String greeting = getResources().getString(resourceId, name);
            Toast.makeText(this, greeting, Toast.LENGTH_LONG).show();

            TextView greetingField = (TextView) findViewById(R.id.greeting_field);
            greetingField.setText(greeting);
        }
    }

}
