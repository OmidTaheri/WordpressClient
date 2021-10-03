package ir.omidtaheri.wpclient.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


import ir.omidtaheri.wpclient.R;
import ir.omidtaheri.wpclient.ui.base.BaseActivity;


import javax.inject.Inject;

import butterknife.ButterKnife;
import ir.omidtaheri.wpclient.ui.main.MainActivity;




public class SplashActivity extends BaseActivity implements SplashMvpView {

    @Inject
    SplashMvpPresenter<SplashMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(SplashActivity.this);

        setUp();

    }



    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {
        YoYo.with(Techniques.BounceIn)
                .duration(3000)
                .playOn(findViewById(R.id.splash_image));

        mPresenter.delayToNextActivity();
    }

    @Override
    public void launchMainActivity() {
        Intent intent = MainActivity.getStartIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }
}
