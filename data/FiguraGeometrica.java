package data;

import java.awt.Canvas;
import view.Observer;

public abstract class FiguraGeometrica extends Canvas implements Observer
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void update() {
		repaint();
	}
}
