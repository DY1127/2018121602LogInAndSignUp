package kr.tjeit.a20181216_02_loginandsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends BaseActivity {

    EditText userIdText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void setupValues() {
        String userIdText = getIntent().getStringExtra(name: "입력 아이디");

    }

    @Override
    public void bindViews() {

    }
}
