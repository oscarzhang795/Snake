package com.oscar.mainactivity

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.SurfaceHolder
import android.view.SurfaceView

class CustomSurfaceView(context: Context, attr: AttributeSet ): SurfaceView(context, attr), SurfaceHolder.Callback {

    init { setWillNotDraw(false) }

    override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun surfaceDestroyed(holder: SurfaceHolder?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun surfaceCreated(holder: SurfaceHolder?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun draw(canvas: Canvas?) {
        super.draw(canvas)
        if (canvas != null) {
            canvas.drawColor(Color.WHITE)
            val paint = Paint()
            paint.color = Color.rgb(0, 0, 0)
            canvas.drawRect(100f, 100f, 200f, 200f, paint)
        }
    }
}