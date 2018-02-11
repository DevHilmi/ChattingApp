package rizaldev.chattingapp.screen.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rizaldev.chattingapp.R;
import rizaldev.chattingapp.utils.ActivityUtils;

public class LoginActivity extends AppCompatActivity {


    LoginFragment loginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        loginFragment = (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.container);
        if (loginFragment == null) {
            loginFragment = LoginFragment.newInstance();
        }
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), loginFragment, R.id.container);
    }
}
