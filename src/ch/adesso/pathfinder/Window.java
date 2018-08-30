package ch.adesso.pathfinder;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	private static final int PIXEL_SIZE = 5;

	private int width;
	private int height;
	private BufferedImage image;

	public Window(int width, int height) {
		super();
		this.width = width * PIXEL_SIZE;
		this.height = height * PIXEL_SIZE;
		initialize();
	}

	private void initialize() {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		JPanel panel = new JPanel() {
			@Override
			public void paint(Graphics graphics) {
				super.paint(graphics);
				graphics.drawImage(image, 0, 0, null);
			}
		};
		panel.setPreferredSize(new Dimension(width, height));
		this.add(panel);
		this.pack();
	}

	public void setColor(int x, int y, int[] color) {
		for (int xOffset = 0; xOffset < PIXEL_SIZE; xOffset++) {
			for (int yOffset = 0; yOffset < PIXEL_SIZE; yOffset++) {
				image.getRaster().setPixel(x * PIXEL_SIZE + xOffset, y * PIXEL_SIZE + yOffset, color);
			}
		}
	}

}
