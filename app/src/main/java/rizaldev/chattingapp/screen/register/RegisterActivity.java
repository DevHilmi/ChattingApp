package rizaldev.chattingapp.screen.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rizaldev.chattingapp.R;
import rizaldev.chattingapp.utils.ActivityUtils;

public class RegisterActivity extends AppCompatActivity {

    RegisterFragment registerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }

    private void initView() {
        registerFragment = (RegisterFragment) getSupportFragmentManager().findFragmentById(R.id.container);
        if (registerFragment == null) {
            registerFragment = RegisterFragment.newInstance();
        }
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), registerFragment, R.id.container);
    }
}
