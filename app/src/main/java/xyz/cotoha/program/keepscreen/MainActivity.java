package xyz.cotoha.program.keepscreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // オンボタンをタップしたら起動
        findViewById(R.id.screen_on_button).setOnClickListener(v -> {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            Toast.makeText(MainActivity.this, "オンになりました", Toast.LENGTH_SHORT).show();
        });

        // オフボタンをタップしたら終了
        findViewById(R.id.screen_off_button).setOnClickListener(v -> {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            Toast.makeText(MainActivity.this, "オフになりました", Toast.LENGTH_SHORT).show();
        });
    }
}


