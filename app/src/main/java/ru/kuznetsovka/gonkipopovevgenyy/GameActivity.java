package ru.kuznetsovka.gonkipopovevgenyy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private ImageView iv_sedan_blue, iv_sport_car, finish;
    private TextView tv_timer, tv_traffic_light;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        iv_sedan_blue = (ImageView) findViewById(R.id.iv_logo);
        iv_sport_car = (ImageView) findViewById(R.id.iv_logo);
        finish= (ImageView) findViewById(R.id.iv_logo);
    }
}