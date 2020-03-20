package com.example.tres_en_raya3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Equis {
    private FloatBuffer bufVertice;
    private float vertice[] = new float [] {
            -2.7f,1.2f,-1.2f,2.7f,-1.2f,1.2f,-2.7f,2.7f,
            -0.7f,1.2f,0.7f,2.7f,0.7f,1.2f,-0.7f,2.7f,
            1.2f,1.2f,2.7f,2.7f,2.7f,1.2f,1.2f,2.7f,
            -2.7f,-0.7f,-1.2f,0.7f,-1.2f,-0.7f,-2.7f,0.7f,
            -0.7f,-0.7f,0.7f,0.7f,0.7f,-0.7f,-0.7f,0.7f,
            1.2f,-0.7f,2.7f,0.7f,2.7f,-0.7f,1.2f,0.7f,
            -2.7f,-2.7f,-1.2f,-1.2f,-1.2f,-2.7f,-2.7f,-1.2f,
            -0.7f,-2.7f,0.7f,-1.2f,0.7f,-2.7f,-0.7f,-1.2f,
            1.2f,-2.7f,2.7f,-1.2f,
            2.7f,-2.7f,1.2f,-1.2f,
    };
    public Equis(){
        ByteBuffer bufByte = ByteBuffer.allocateDirect(vertice.length * 4);
        bufByte.order(ByteOrder.nativeOrder());
        bufVertice = bufByte.asFloatBuffer();
        bufVertice.put(vertice).rewind();;
    }
    public void dibuja1(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);

        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 0,0);
        gl.glDrawArrays(GL10.GL_LINES, 0, 2);
        gl.glDrawArrays(GL10.GL_LINES, 2, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }

    public void dibuja2(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 0,0);
        gl.glDrawArrays(GL10.GL_LINES, 4, 2);
        gl.glDrawArrays(GL10.GL_LINES, 6, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja3(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 0,0);
        gl.glDrawArrays(GL10.GL_LINES, 8, 2);
        gl.glDrawArrays(GL10.GL_LINES, 10, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja4(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 0,0);
        gl.glDrawArrays(GL10.GL_LINES, 12, 2);
        gl.glDrawArrays(GL10.GL_LINES, 14, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja5(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 0,0);
        gl.glDrawArrays(GL10.GL_LINES, 16, 2);
        gl.glDrawArrays(GL10.GL_LINES, 18, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja6(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 0,0);
        gl.glDrawArrays(GL10.GL_LINES, 20, 2);
        gl.glDrawArrays(GL10.GL_LINES, 22, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja7(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 0,0);
        gl.glDrawArrays(GL10.GL_LINES, 24, 2);
        gl.glDrawArrays(GL10.GL_LINES, 26, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja8(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 0,0);
        gl.glDrawArrays(GL10.GL_LINES, 28, 2);
        gl.glDrawArrays(GL10.GL_LINES, 30, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }

    public void dibuja9(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glColor4f(0, 0, 0,0);
        gl.glDrawArrays(GL10.GL_LINES, 32, 2);
        gl.glDrawArrays(GL10.GL_LINES, 34, 2);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
}
