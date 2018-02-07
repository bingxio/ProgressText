package cn.xyiio.progresstext;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.xyiio.progresstext.view.ProgressText;

/**
 * author: Turaiiao
 * date: 2018-02-07 10:50.
 * url: https://github.com/Turaiiao
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressText progressText_a = (ProgressText) findViewById(R.id.progressText_a);
        final ProgressText progressText_b = (ProgressText) findViewById(R.id.progressText_b);
        final ProgressText progressText_c = (ProgressText) findViewById(R.id.progressText_c);
        final ProgressText progressText_d = (ProgressText) findViewById(R.id.progressText_d);
        final ProgressText progressText_e = (ProgressText) findViewById(R.id.progressText_e);
        final ProgressText progressText_f = (ProgressText) findViewById(R.id.progressText_f);

        progressText_a.setHeadText("已坚持");
        progressText_a.startSetTextAnimationWithDuration(12, 30, 2000);
        progressText_a.setBottomText("天");

        progressText_b.setHeadText("已坚持");
        progressText_b.setHeadTextSize(13);
        progressText_b.setEndTextColor(Color.BLUE);
        progressText_b.setBottomTextSize(13);
        progressText_b.startSetTextAnimation(20, 50);
        progressText_b.setBottomText("天");

        progressText_c.setHeadText("已坚持");
        progressText_c.setHeadTextSize(15);
        progressText_c.setBottomTextSize(15);
        progressText_c.startSetTextAnimation(20, 50);
        progressText_c.setBottomText("天");

        progressText_d.setHeadText("已坚持");
        progressText_d.setHeadTextSize(15);
        progressText_d.setHeadTextColor(Color.RED);
        progressText_d.setStartTextColor(ProgressText.DEFAULT_TEXT_COLOR);
        progressText_d.setLineColor(ProgressText.DEFAULT_TEXT_COLOR);
        progressText_d.setEndTextColor(ProgressText.DEFAULT_TEXT_COLOR);
        progressText_d.setBottomTextSize(15);
        progressText_d.setBottomTextColor(Color.RED);
        progressText_d.startSetTextAnimation(20, 50);
        progressText_d.setBottomText("天");

        progressText_e.setHeadText("头部文字");
        progressText_e.setHeadTextSize(15);
        progressText_e.setStartText(6);
        progressText_e.setLineText("分割线");
        progressText_e.setEndText(50);
        progressText_e.setBottomTextSize(15);
        progressText_e.startSetTextAnimation(20, 50);
        progressText_e.setBottomText("底部文字");

        progressText_f.setHeadText("已坚持");
        progressText_f.setHeadTextSize(15);
        progressText_f.setHeadTextColor(Color.RED);
        progressText_f.setLineText("|");
        progressText_f.setLineTextSize(ProgressText.START_TEXT_SIZE);
        progressText_f.setLineColor(Color.RED);
        progressText_f.setStartTextColor(ProgressText.DEFAULT_TEXT_COLOR);
        progressText_f.setLineColor(ProgressText.DEFAULT_TEXT_COLOR);
        progressText_f.setEndTextColor(ProgressText.DEFAULT_TEXT_COLOR);
        progressText_f.setBottomTextSize(15);
        progressText_f.setBottomTextColor(Color.RED);
        progressText_f.startSetTextAnimation(20, 50);
        progressText_f.setBottomText("天");
    }
}
