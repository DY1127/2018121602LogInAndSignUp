package kr.tjeit.a20181216_02_loginandsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        public abstract void setupEvent();
        public abstract void setupValues();
        public abstract void bindViews();
    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void setupValues() {

    }

    @Override
    public void bindViews() {

    }
}
