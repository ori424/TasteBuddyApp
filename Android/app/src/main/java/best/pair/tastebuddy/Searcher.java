package best.pair.tastebuddy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.List;

public class Searcher extends AppCompatActivity {

    private static List<String> distances = Arrays.asList("500 meters", "1 km", "2 km", "5 km", "10 km");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_searcher);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        populateSpinner();
    }

    private void populateSpinner() {
        Spinner distanceSpinner = (Spinner)findViewById(R.id.SpinnerDistance);

        final ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, android.R.id.text1);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        distanceSpinner.setAdapter(spinnerAdapter);
        distances.stream().forEach(x -> spinnerAdapter.add(x));
        spinnerAdapter.notifyDataSetChanged();
    }

    public void searchQuery(View view) {
        String queryText = ((EditText) findViewById(R.id.EditTextQueryTerm)).getText().toString();

    }
}
