package work.rrr_archives.squaremeter_and_tatami;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static work.rrr_archives.squaremeter_and_tatami.R.id.editText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void start_math(View view){
        TextView heihou=(TextView)findViewById(R.id.square_answer);
        TextView tatami_kazu=(TextView)findViewById(R.id.tatami);
        EditText tatetext=(EditText)findViewById(editText);
        EditText yokotext=(EditText)findViewById(R.id.editText2);
        Editable get_tateText=tatetext.getText();
        Editable get_yokoText=yokotext.getText();
        double tate=Double.parseDouble(get_tateText.toString());
        double yoko=Double.parseDouble(get_yokoText.toString());
        heihou.setText(String.valueOf(tate*yoko));
        tatami_kazu.setText(String.valueOf(tate*yoko*0.3025));

    }
}
