package ind.xwm.imagemulti;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MyActivity extends Activity {
    private ImageView iv;
    private Canvas canvas;
    private Paint paint;
    private Bitmap backgroundBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        iv = (ImageView) findViewById(R.id.iv);
        backgroundBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.a1);
        Bitmap tempBitmap = Bitmap.createBitmap(backgroundBitmap.getWidth(), backgroundBitmap.getHeight(), backgroundBitmap.getConfig());
        canvas = new Canvas(tempBitmap);
        paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawBitmap(backgroundBitmap, new Matrix(), paint);
        iv.setImageBitmap(tempBitmap);
    }


    public void multiImage(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
        Bitmap tempBitmap = Bitmap.createBitmap(backgroundBitmap.getWidth(), backgroundBitmap.getHeight(), backgroundBitmap.getConfig());
        canvas = new Canvas(tempBitmap);
        paint.setXfermode(null);
        canvas.drawBitmap(backgroundBitmap, new Matrix(), paint);
        iv.setImageBitmap(tempBitmap);
        switch(view.getId()) {
            case R.id.bt_ADD:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
                break;
            case R.id.bt_CLEAR:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                break;
            case R.id.bt_DARKEN:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
                break;
            case R.id.bt_DST:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST));
                break;
            case R.id.bt_DST_ATOP:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case R.id.bt_DST_IN:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case R.id.bt_DST_OUT:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case R.id.bt_DST_OVER:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                break;
            case R.id.bt_LIGHTEN:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                break;
            case R.id.bt_MULTIPLY:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                break;
            case R.id.bt_OVERLAY:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
                break;
            case R.id.bt_SCREEN:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
                break;
            case R.id.bt_SRC:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                break;
            case R.id.bt_SRC_ATOP:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                break;
            case R.id.bt_SRC_IN:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                break;
            case R.id.bt_SRC_OUT:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                break;
            case R.id.bt_SRC_OVER:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                break;
            case R.id.bt_XOR:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
        }
        canvas.drawBitmap(bitmap, new Matrix(), paint);
        iv.invalidate();


    }
}
