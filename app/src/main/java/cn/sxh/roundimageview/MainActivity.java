package cn.sxh.roundimageview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private TextView mTextView;
    private ImageView mImageView;
    private RoundView mRoundView;
    @Override
    protected int getContentViewID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initUI() {
        mTextView = (TextView) findViewById(R.id.tv);
        mImageView = (ImageView) findViewById(R.id.normal_iv);
        mRoundView = (RoundView) findViewById(R.id.round);
        mTextView.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv:
                mImageView.setImageResource(R.mipmap.head);
                mRoundView.setImageResource(R.mipmap.head);
                break;
        }
    }
}
