package map;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by 18679 on 2018-3-24.
 */

public class DrawMap extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder mSurfaceHolder;
    private Paint mPaint;
    private Thread mThread;

    public DrawMap(Context context) {
        super(context);
    }

    public DrawMap(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mSurfaceHolder = this.getHolder();
        mThread = new MyThread();

    }

    public DrawMap(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        mThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
        }
    }
}
