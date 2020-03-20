package com.example.tres_en_raya3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
public class Triangulo {
    private float vertice[]={
            -2.7f,1.2f,-2,2.7f,-1.2f,1.2f,
            -0.7f,1.2f,0,2.7f,0.7f,1.2f,
            1.2f,1.2f,2,2.7f,2.7f,1.2f,
            -2.7f,-0.7f,-2,0.7f,-1.2f,-0.7f,
            -0.7f,-0.7f,0,0.7f,0.7f,-0.7f,
            1.2f,-0.7f,2,0.7f,2.7f,-0.7f,
            -2.7f,-2.7f,-2,-1.2f,-1.2f,-2.7f,
            -0.7f,-2.7f,0,-1.2f,0.7f,-2.7f,
            1.2f,-2.7f,2,-1.2f,2.7f,-2.7f,
    };
    FloatBuffer bufVertice;
    public Triangulo(){
        ByteBuffer bufByte=ByteBuffer.allocateDirect(vertice.length*4);
        bufByte.order(ByteOrder.nativeOrder());//1 2 3 4 => 4 3 2 1
        bufVertice=bufByte.asFloatBuffer();//float
        bufVertice.put(vertice);//inserta buffer
        bufVertice.rewind();//puntero al principio

    }
    public void dibuja1(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glColor4f(1, 0, 0, 0);//rgba
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glDrawArrays(GL10.GL_LINE_LOOP, 0, 3);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }

    public void dibuja2(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glColor4f(1, 0, 0, 0);//rgba
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glDrawArrays(GL10.GL_LINE_LOOP, 3, 3);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }

    public void dibuja3(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glColor4f(1, 0, 0, 0);//rgba
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glDrawArrays(GL10.GL_LINE_LOOP, 6, 3);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja4(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glColor4f(1, 0, 0, 0);//rgba
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glDrawArrays(GL10.GL_LINE_LOOP, 9, 3);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja5(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glColor4f(1, 0, 0, 0);//rgba
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glDrawArrays(GL10.GL_LINE_LOOP, 12, 3);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja6(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glColor4f(1, 0, 0, 0);//rgba
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glDrawArrays(GL10.GL_LINE_LOOP, 15, 3);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja7(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glColor4f(1, 0, 0, 0);//rgba
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glDrawArrays(GL10.GL_LINE_LOOP, 18, 3);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja8(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glColor4f(1, 0, 0, 0);//rgba
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glDrawArrays(GL10.GL_LINE_LOOP, 21, 3);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
    public void dibuja9(GL10 gl){

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glColor4f(1, 0, 0, 0);//rgba
        gl.glVertexPointer(2, GL10.GL_FLOAT, 0, bufVertice);
        gl.glDrawArrays(GL10.GL_LINE_LOOP, 24, 3);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
}
