package kr.tjeit.a20181216_02_loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpStep2Activity extends BaseActivity {

    Button nextBtn;
    EditText pwEdt;
    EditText idEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_step2);

        bindViews();
        setupEvent();
        setupValues();
    }

    @Override
    public void setupEvent() {
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                1. 아이디가 이메일? @있냐?
                if(!idEdt.getText().toString().contains("@")){
                    Toast.makeText(mContext, "이메일 형식으로 입력해 주셔야 합니다", Toast.LENGTH_SHORT).show();

                    return;
                }

//                2. 비밀번호 길이 8개?
                if(pwEdt.getText().toString().length()<8){
                    Toast.makeText(mContext, "8글자 이상으로 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }

//                회원가입완료 Toast
//                로그인 화면으로 이동

                Toast.makeText(mContext, "회원가입에 성공했습니다", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, LoginActivity.class);
//          새 액티비티를 띄울 때, 기존에 잇던 액티비티를 날려야 한다 (취소버튼 눌렀는데 회원가입 페이지로 오면 안됨)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    @Override
    public void setupValues() {

    }

    @Override
    public void bindViews() {

    }
}
