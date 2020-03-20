package com.example.tres_en_raya3;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.opengl.GLSurfaceView.Renderer;
import android.view.MotionEvent;
import android.widget.Toast;

public class Renderiza extends GLSurfaceView implements Renderer {

	private Context context;
	int ancho, alto;
	int n1, n2, n3, n4, n5, n6, n7, n8, n9, mov = 1;
	private boolean vec[] = new boolean[9];

	boolean sw1, turno = true;

	public Renderiza(Context context) {
		super(context);
		this.context = context;
		this.setRenderer(this);
		this.requestFocus();
		this.setFocusableInTouchMode(true);
		this.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
	}

	private Tres_raya eje;
	private Equis ex;
	private Triangulo t;

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {

		eje = new Tres_raya();
		ex = new Equis();
		t = new Triangulo();
		gl.glClearColor(1, 1, 1, 1);
	}

	@Override
	public void onDrawFrame(GL10 gl) {
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		eje.dibuja(gl);
		gl.glTranslatef(0, 0, 0);
		if (n1 == 1) {
			if (vec[0]) {
				ex.dibuja1(gl);
			} else {
				t.dibuja1(gl);
			}

		}

		if (n2 == 2) {
			if (vec[1]) {
				ex.dibuja2(gl);
			} else {
				t.dibuja2(gl);
			}

		}

		if (n3 == 3) {
			if (vec[2]) {
				ex.dibuja3(gl);
			} else {
				t.dibuja3(gl);
			}

		}

		if (n4 == 4) {
			if (vec[3]) {
				ex.dibuja4(gl);
			} else {
				t.dibuja4(gl);
			}

		}

		if (n5 == 5) {
			if (vec[4]) {
				ex.dibuja5(gl);
			} else {
				t.dibuja5(gl);
			}

		}

		if (n6 == 6) {
			if (vec[5]) {
				ex.dibuja6(gl);
			} else {
				t.dibuja6(gl);
			}

		}

		if (n7 == 7) {
			if (vec[6]) {
				ex.dibuja7(gl);
			} else {
				t.dibuja7(gl);
			}

		}

		if (n8 == 8) {
			if (vec[7]) {
				ex.dibuja8(gl);
			} else {
				t.dibuja8(gl);
			}

		}

		if (n9 == 9) {
			if (vec[8]) {
				ex.dibuja9(gl);
			} else {
				t.dibuja9(gl);
			}

		}

	}

	@Override
	public void onSurfaceChanged(GL10 gl, int w, int h) {
		ancho = w;
		alto = h;
		gl.glViewport(0, 0, w, h);
		gl.glMatrixMode(GL10.GL_PROJECTION);
		gl.glLoadIdentity();
		GLU.gluOrtho2D(gl, -4, 4, -6, 6);
		gl.glMatrixMode(GL10.GL_MODELVIEW);
		gl.glLoadIdentity();
		gl.glTranslatef(0, 0, 0);

	}

	@Override
	public boolean onTouchEvent(MotionEvent e) {
		float posx = e.getX();
		float posy = e.getY();
		if (mov <= 9){
			if (e.getAction() == MotionEvent.ACTION_UP) {
				posx = ((posx / (float) ancho) * 8) - 4;
				posy = ((1 - posy / (float) alto) * 12) - 6;



				if (puntoEstadentroDelRectangulo(posx, posy, -3, 1, 2, 2) & n1==0) {
					if (turno) {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 2", Toast.LENGTH_SHORT).show();
						turno = !turno;
					} else {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 1", Toast.LENGTH_SHORT).show();
						turno = !turno;
					}
					mov++;
					n1 = 1;
					vec[0] = sw1;
					sw1 = !sw1;
					requestRender();
				}
				if (puntoEstadentroDelRectangulo(posx, posy, -1, 1, 2, 2) && n2 ==0 ) {
					if (turno) {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 2", Toast.LENGTH_SHORT).show();
						turno = !turno;
					} else {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 1", Toast.LENGTH_SHORT).show();
						turno = !turno;
					}
					mov++;
					n2 = 2;
					vec[1] = sw1;
					sw1 = !sw1;
					requestRender();
				}

				if (puntoEstadentroDelRectangulo(posx, posy, 1, 1, 2, 2) & n3==0) {
					if (turno) {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 2", Toast.LENGTH_SHORT).show();
						turno = !turno;
					} else {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 1", Toast.LENGTH_SHORT).show();
						turno = !turno;
					}
					mov++;
					n3 = 3;
					vec[2] = sw1;
					sw1 = !sw1;
					requestRender();
				}

				if (puntoEstadentroDelRectangulo(posx, posy, -3, -1, 2, 2) & n4 ==0) {
					if (turno) {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 2", Toast.LENGTH_SHORT).show();
						turno = !turno;
					} else {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 1", Toast.LENGTH_SHORT).show();
						turno = !turno;
					}
					mov++;
					n4 = 4;
					vec[3] = sw1;
					sw1 = !sw1;
					requestRender();
				}
				if (puntoEstadentroDelRectangulo(posx, posy, -1, -1, 2, 2) && n5 == 0) {
					if (turno) {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 2", Toast.LENGTH_SHORT).show();
						turno = !turno;
					} else {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 1", Toast.LENGTH_SHORT).show();
						turno = !turno;
					}
					mov++;
					n5 = 5;
					vec[4] = sw1;
					sw1 = !sw1;
					requestRender();
				}
				if (puntoEstadentroDelRectangulo(posx, posy, 1, -1, 2, 2) & n6 ==0) {
					if (turno) {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 2", Toast.LENGTH_SHORT).show();
						turno = !turno;
					} else {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 1", Toast.LENGTH_SHORT).show();
						turno = !turno;
					}
					mov++;
					n6 = 6;
					vec[5] = sw1;
					sw1 = !sw1;
					requestRender();
				}

				if (puntoEstadentroDelRectangulo(posx, posy, -3, -3, 2, 2) & n7==0) {
					if (turno) {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 2", Toast.LENGTH_SHORT).show();
						turno = !turno;
					} else {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 1", Toast.LENGTH_SHORT).show();
						turno = !turno;
					}
					mov++;
					n7 = 7;
					vec[6] = sw1;
					sw1 = !sw1;
					requestRender();
				}

				if (puntoEstadentroDelRectangulo(posx, posy, -1, -3, 2, 2) & n8==0) {
					if (turno) {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 2", Toast.LENGTH_SHORT).show();
						turno = !turno;
					} else {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 1", Toast.LENGTH_SHORT).show();
						turno = !turno;
					}
					mov++;
					n8 = 8;
					vec[7] = sw1;
					sw1 = !sw1;
					requestRender();
				}

				if (puntoEstadentroDelRectangulo(posx, posy, 1, -3, 2, 2) & n9==0) {
					if (turno) {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 2", Toast.LENGTH_SHORT).show();
						turno = !turno;
					} else {
						Toast.makeText(context.getApplicationContext(),
								"Jugador 1", Toast.LENGTH_SHORT).show();
						turno = !turno;
					}
					mov++;
					n9 = 9;
					vec[8] = sw1;
					sw1 = !sw1;
					requestRender();
				}
			 }
		}
		else {
			Toast.makeText(context.getApplicationContext(), "Game over",
					Toast.LENGTH_SHORT).show();

		}
		
		return true;
	}

	private boolean puntoEstadentroDelRectangulo(float posx, float posy, int x,
			int y, int ancho, int alto) {

		return (x < posx && posx < x + ancho && y < posy && posy < y + alto);
	}

}
