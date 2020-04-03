package biz.nusso.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class BallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);

        final int[] ballsArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        final ImageView mBall = (ImageView)findViewById(R.id.imageBall);

        Button mButton = (Button)findViewById(R.id.btnAsk);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int random = new Random().nextInt(5) ;
                mBall.setImageResource(ballsArray[random]);
            }
        });

    }
}
