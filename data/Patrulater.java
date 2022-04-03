package data;

import java.awt.Color;
import java.awt.Graphics;



public class Patrulater extends FiguraGeometrica
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Punct a, b, c, d;
	public static class Builder
	{
		Punct a, b, c, d;
		
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
		public Patrulater build()
		{
			return new Patrulater();
		}
	}
	private Patrulater()
	{
		a = new Punct.Builder().build();
		b = new Punct.Builder().build();
		c = new Punct.Builder().build();
		d = new Punct.Builder().build();
	}
	private Patrulater(Punct u, Punct v, Punct q, Punct w)
	{
		this.a = u;
		this.b = v;
		this.c = q;
		this.d = w;
	}
	public void paint(Graphics g1)
	{
		int r,g,b1;
		r = ( int )( Math.random() * 256 );
        g = ( int )( Math.random() * 256 );
        b1 = ( int )( Math.random() * 256 );
        int []x = {40,50,110,140};
		int []y = {140,110,90,100};
		g1.setColor(new Color(r,g,b1));
		g1.fillPolygon(x,y,4);
		
	}
	
}
