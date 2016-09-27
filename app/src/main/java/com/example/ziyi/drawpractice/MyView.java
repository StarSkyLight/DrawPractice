package com.example.ziyi.drawpractice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class MyView extends View {
    Context m_context;

    public MyView(Context context) {
        super(context);
        m_context = context;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        Paint paint = new Paint();

        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

       canvas.drawRect(10,100,300,300,paint);
       canvas.drawRect(660,100,950,300,paint);

        paint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(480,700,200,paint);

        Path path = new Path();
        path.moveTo(300,1000);
        path.lineTo(700,1000);
        path.lineTo(500,1200);
        path.close();
        paint.setColor(Color.RED);
        canvas.drawPath(path,paint);

    }

}
