package com.example.tres_en_raya3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
public class Tres_raya {
    private FloatBuffer bufVertice;
    private float vertice[] = new float [] {
            -1,3,-1,-3,
            1,3,1,-3,
            -3,1,3,1,
            -3,-1,3,-1,
    };
    public Tres_raya(){
        ByteBuffer bufByte = ByteBuffer.allocateDirect(vertice.length * 4);
        bufByte.order(ByteOrder.nativeOrder());
        bufVertice = bufByte.asFloatBuffer();
        bufVertice.put(vertice).rewind();;

    }
    public void dibuja(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 1, 0);
        gl.glEnable(GL10.GL_LINE_SMOOTH); //mejora la calida de la linea
		gl.glLineWidth(10f); //ancho de la linea
        gl.glDrawArrays(GL10.GL_LINES, 0, 2);
        gl.glDrawArrays(GL10.GL_LINES, 2, 2);
        gl.glDrawArrays(GL10.GL_LINES, 4, 2);
        gl.glDrawArrays(GL10.GL_LINES, 6, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }

}