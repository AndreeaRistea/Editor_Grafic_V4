package data;

import java.awt.Color;
import java.awt.Graphics;


public class Triunghi extends FiguraGeometrica
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Punct a, b, c;
	public static class Builder
	{
		Punct a, b, c;
		public Builder doPointA (Punct a)
		{
			this.a = a;
			return this;
		}
		public Builder doPointB (Punct b)
		{
			this.b = b;
			return this;
		}
		public Builder doPointC (Punct c)
		{
			this.c = c;
			return this;
		}
		public Triunghi build()
		{
			return new Triunghi();
		}
	}
	private Triunghi()
	{
		a = new Punct.Builder().build();
		b = new Punct.Builder().build();
		c = new Punct.Builder().build();
	}
	
	private Triunghi (Punct t, Punct u, Punct v)
	{
		this.a = t;
		this.b = u;
		this.c = v;
	}
	
	public void paint(Graphics g1)
	{
		int []x = {0,150,300};
		int []y = {200,0,200};
		int r,g,b1;
		r = ( int )( Math.random() * 256 );
        g = ( int )( Math.random() * 256 );
        b1 = ( int )( Math.random() * 256 );
        g1.setColor(new Color(r,g,b1));
        g1.fillPolygon(x,y,3);
        
	}
	
	public boolean setVisiblie() {
		return true;
	}

}
