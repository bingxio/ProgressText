package cn.xyiio.progresstext.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cn.xyiio.progresstext.R;

/**
 * Created by turaiiao on 18-2-7 11:21.
 * @author turaiiao
 * @version 0.0.4
 * @email 1171840237@qq.com
 * @url https://github.com/turaiiao/progresstext
 */

public class ProgressText extends RelativeLayout {
    /* 暂停时间毫秒 */
    private int STOP_MILLIS;

    /* 默认文字颜色 */
    public static int DEFAULT_TEXT_COLOR = Color.parseColor("#8A000000");

    /* 默认进度文字颜色 */
    public static int DEFAULT_START_COLOR = Color.parseColor("#E91E63");

    /* 默认字体大小 */
    public static int HEAD_TEXT_SIZE = 11;
    public static int START_TEXT_SIZE = 25;
    public static int END_TEXT_SIZE = 11;
    public static int LINE_TEXT_SIZE = 11;
    public static int BOTTOM_TEXT_SIZE = 11;

    /* 默认分割线 */
    public static String DEFAULT_LINE_TEXT = "/";

    private TextView headTextView;
    private TextView bottomTextView;

    private TextView lineTextView;

    private TextView startTextView;
    private TextView endTextView;

    public ProgressText(Context context) {
        super(context);
    }

    public ProgressText(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.layout_progress_text, this);

        init();
    }

    private void init() {
        headTextView = (TextView) findViewById(R.id.a);
        bottomTextView = (TextView) findViewById(R.id.e);
        startTextView = (TextView) findViewById(R.id.b);
        lineTextView = (TextView) findViewById(R.id.c);
        endTextView = (TextView) findViewById(R.id.d);

        headTextView.setTextColor(DEFAULT_TEXT_COLOR);
        bottomTextView.setTextColor(DEFAULT_TEXT_COLOR);
        startTextView.setTextColor(DEFAULT_START_COLOR);
        lineTextView.setTextColor(DEFAULT_START_COLOR);
        endTextView.setTextColor(DEFAULT_START_COLOR);

        headTextView.setTextSize(HEAD_TEXT_SIZE);
        bottomTextView.setTextSize(BOTTOM_TEXT_SIZE);
        startTextView.setTextSize(START_TEXT_SIZE);
        lineTextView.setTextSize(LINE_TEXT_SIZE);
        endTextView.setTextSize(END_TEXT_SIZE);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    public void setStartText(int progress) {
        startTextView.setText("" + progress);
        invalidate();
    }

    public void setEndText(int progress) {
        endTextView.setText("" + progress);
        invalidate();
    }

    public void setHeadText(String text) {
        headTextView.setText(text);
        invalidate();
    }

    public void setBottomText(String text) {
        bottomTextView.setText(text);
        invalidate();
    }

    public void setLineText(String text) {
        lineTextView.setText(text);
        invalidate();
    }

    public void setTextAll(String head_text, int start_progress, int end_progress, String line_text, String bottom_text) {
        headTextView.setText(head_text);
        startTextView.setText(start_progress);
        endTextView.setText(end_progress);
        lineTextView.setText(line_text);
        bottomTextView.setText(bottom_text);
        invalidate();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    public void setHeadTextColor(int color) {
        headTextView.setTextColor(color);
        invalidate();
    }

    public void setStartTextColor(int color) {
        startTextView.setTextColor(color);
        invalidate();
    }

    public void setEndTextColor(int color) {
        endTextView.setTextColor(color);
        invalidate();
    }

    public void setLineColor(int color) {
        lineTextView.setTextColor(color);
        invalidate();
    }

    public void setBottomTextColor(int color) {
        bottomTextView.setTextColor(color);
        invalidate();
    }

    public void setTextColorAll(int head_color, int start_color, int end_color, int line_color, int bottom_color) {
        headTextView.setTextColor(head_color);
        startTextView.setTextColor(start_color);
        endTextView.setTextColor(end_color);
        lineTextView.setTextColor(line_color);
        bottomTextView.setTextColor(bottom_color);
        invalidate();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    public void setHeadTextSize(float size) {
        headTextView.setTextSize(size);
        invalidate();
    }

    public void setStartTextSize(float size) {
        startTextView.setTextSize(size);
        invalidate();
    }

    public void setEndTextSize(float size) {
        endTextView.setTextSize(size);
        invalidate();
    }

    public void setLineTextSize(float size) {
        lineTextView.setTextSize(size);
        invalidate();
    }

    public void setBottomTextSize(float size) {
        bottomTextView.setTextSize(size);
        invalidate();
    }

    public void setTextSizeAll(float head_size, float start_size, float end_size, float line_size, float bottom_size) {
        headTextView.setTextSize(head_size);
        startTextView.setTextSize(start_size);
        endTextView.setTextSize(end_size);
        lineTextView.setTextSize(line_size);
        bottomTextView.setTextSize(bottom_size);
        invalidate();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 开启文字动画，如果大于 20，转换速度变快
     * @param start_size 起始文字
     * @param end_size 结束文字
     */
    public void startSetTextAnimation(final int start_size, final int end_size) {
        if (start_size > 20)
            STOP_MILLIS = 1000;
        else
            STOP_MILLIS = 2000;

        ValueAnimator anim = ValueAnimator.ofInt(1, start_size);
        anim.setDuration(STOP_MILLIS);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currentValue = (int) animation.getAnimatedValue();

                startTextView.setText("" + currentValue);
                endTextView.setText("" + end_size);
            }
        });
        anim.start();
    }

    /**
     * 开启文字动画，自定义动画速度
     * @param start_size 起始文字
     * @param end_size 结束文字
     * @param duration 动画速度
     */
    public void startSetTextAnimationWithDuration(final int start_size, final int end_size, final int duration) {
        ValueAnimator anim = ValueAnimator.ofInt(1, start_size);
        anim.setDuration(duration);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currentValue = (int) animation.getAnimatedValue();

                startTextView.setText("" + currentValue);
                endTextView.setText("" + end_size);
            }
        });
        anim.start();
    }

    // version 0.0.4 add :
    ////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 开启文字动画，从零起
     * @param start_size 起始文字
     * @param end_size 结束文字
     */
    public void startSetTextAnimationWithNumber(final int start_size, final int end_size) {
        if (start_size > 20)
            STOP_MILLIS = 1000;
        else
            STOP_MILLIS = 2000;

        ValueAnimator anim = ValueAnimator.ofInt(0, start_size);
        anim.setDuration(STOP_MILLIS);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currentValue = (int) animation.getAnimatedValue();

                startTextView.setText("" + currentValue);
                endTextView.setText("" + end_size);
            }
        });
        anim.start();
    }

    /**
     * 开启文字动画，从零起，自定义动画速度
     * @param start_size 起始文字
     * @param end_size 结束文字
     * @param duration 动画速度
     */
    public void startSetTextAnimationWithNumberAndDuration(final int start_size, final int end_size, int duration) {
        ValueAnimator anim = ValueAnimator.ofInt(0, start_size);
        anim.setDuration(duration);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currentValue = (int) animation.getAnimatedValue();

                startTextView.setText("" + currentValue);
                endTextView.setText("" + end_size);
            }
        });
        anim.start();
    }

    /**
     * 开启文字动画，起始文字增加动画，自定义动画速度
     * @param start_size 起始文字
     * @param end_size 结束文字
     * @param add_size 增加进度
     * @param duration 动画速度
     */
    public void setStartTextAddNumber(int start_size, int add_size, final int end_size, int duration) {
        ValueAnimator anim = ValueAnimator.ofInt(0, start_size + add_size);
        anim.setDuration(duration);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currentValue = (int) animation.getAnimatedValue();

                startTextView.setText("" + currentValue);
                endTextView.setText("" + end_size);
            }
        });
        anim.start();
    }
}
