package e.elemcla.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

    button1.setOnClickListener ((View v) -> {
            goToSecondActivity();
    });

    button2.setOnClickListener ((View v) -> {
            goToThirdActivity();
    });
}
    private void goToSecondActivity()
    {
        Intent intent = new Intent(this, FullMapActivity.class);
        startActivity(intent);
    }
    private void goToThirdActivity()
    {
        Intent intent = new Intent(this, DesksPage.class);
        startActivity(intent);
    }
}
