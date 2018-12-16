package kr.tjeit.a20181216_02_loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class SignUpActivity extends BaseActivity {

    CheckBox          allCheckbox;
    CheckBox agreementCheckbox;
    CheckBox moneyCheckBox;
    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bindViews();
        setupEvent();
        setValues();
    }

    @Override
    public void setupEvent() {

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (allCheckbox.isChecked() && moneyCheckBox.isChecked() && agreementCheckbox.isChecked()) {
//                     다음 화면으로 이동해야 함
                    Intent intent = new Intent(mContext, SignUpStep2Activity.class);
                    startActivity(intent);
                }
                else {
//                    사용자에게 모두 동의하셔야 가입이 가능합니다. 안내메세지.
                    Toast.makeText(mContext, "모두 동의하셔야 가입이 가능합니다", Toast.LENGTH_SHORT).show();
                }
            }
        });

        allCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

//                isChecked: true  ==> 눌리는 상황
//                    false ==> 해제

                if(isChecked){
                    moneyCheckBox.setChecked(true);
                    agreementCheckbox.setChecked(true);
                }

                else{
                    moneyCheckBox.setChecked(false);
                    agreementCheckbox.setChecked(false);
                }

            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

    }
}
