package tweenanim.tweenanim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button  button1;
    private View    button2;
    private View    button3;
    private View    button4;
    private Button  button5;
    private ImageView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = findViewById(R.id.image);
        button1 = findViewById(R.id.pingyi);
        button2 = findViewById(R.id.xuanzhuan);
        button3 = findViewById(R.id.suofan);
        button4 = findViewById(R.id.touming);
        button5=findViewById(R.id.together);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pingyi:
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.pingyi);
                viewById.startAnimation(animation);
                System.out.println("哈哈");
                break;
            case R.id.xuanzhuan:
                Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.xuanzhuan);
                viewById.startAnimation(animation3);
                break;
            case R.id.suofan:
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.suofan);
                viewById.startAnimation(animation2);
                break;
            case R.id.touming:
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.touming);
                viewById.startAnimation(animation1);
                break;
            case R.id.together:
                Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set);
                viewById.startAnimation(animation4);
                default:
                    break;
        }
    }
}
