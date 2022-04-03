package data;

import java.awt.Color;
import java.awt.Graphics;

//import XML.Load;

public class Dreapta extends FiguraGeometrica 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Punct a, b;
	public static class Builder
	{
		Punct a, b;
		public Builder doPointStart (Punct a)
		{
			this.a = a;
			return this;
		}
		public Builder doPointFinish (Punct b)
		{
			this.b = b;
			return this;
		}
		public Dreapta build()
		{
			return new Dreapta();
		}
	}
	private Dreapta()
	{
		a = new Punct.Builder().build();
		b = new Punct.Builder().build();
	}
	private Dreapta (Punct t, Punct v)
	{
		this.a = t;
		this.b = v;
	}
	public void paint(Graphics g1)
	{
		int r,g,b1;
		r = ( int )( Math.random() * 256 );
        g = ( int )( Math.random() * 256 );
        b1 = ( int )( Math.random() * 256 );
        
		g1.setColor(new Color(r,g,b1));
		g1.drawLine(100, 100, 500, 100);
		
	}
	
	public boolean setVisiblie() {
		return true;
	}

}
