package kr.tjeit.a20181216_02_loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends BaseActivity {

    TextView signUpTxt;
    Button LoginBtn;
    EditText idEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        public abstract void setupEvent();
        public abstract void setValues();
        public abstract void bindViews();
    }

    @Override
    public void setupEvent() {
        signUpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, SignUpActivity.class);
                startActivity(intent);
            }
        });

    LoginBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(mContext, MainActivity.class);
            intent.putExtra(name:"입력아이디", inputid);
            startActivity(intent);
        }
    });

    }

    @Override
    public void setValues() {



    }

    @Override
    public void bindViews() {

        signUpTxt = findViewById(R.id.signUpTxt);
    }
}
