package net.decentered.stuff.lissajous.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class CurvePanel extends JPanel implements ParameterChangedListener {

    private double x;
    private double y;
    private double phase;

    private static final int DATA_POINTS = 1800;

    public CurvePanel() {
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        if(this.x == 0 || this.y == 0) {
            return;
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;

        double scale = Math.min(width, height) / 2.2;

        Path2D.Double path = new Path2D.Double();

        for (int i = 0; i <= DATA_POINTS; i++) {

            double t = (2 * Math.PI * i) / DATA_POINTS;

            double x = Math.sin(this.x * t + phase);
            double y = Math.sin(this.y * t);

            int pointX = centerX + (int)(x * scale);
            int pointY = centerY - (int)(y * scale);

            if (i == 0) {
                path.moveTo(pointX, pointY);
            } else {
                path.lineTo(pointX, pointY);
            }
        }

        g2d.setColor(new Color(50, 205, 50));
        g2d.setStroke(new BasicStroke(2.5f));
        g2d.draw(path);

    }

    @Override
    public void xChanged(double x) {
        this.x = x;
        repaint();
    }

    @Override
    public void yChanged(double y) {
        this.y=y;
        repaint();
    }

    @Override
    public void phaseChanged(double phase) {
        this.phase=Math.toRadians(phase);
        repaint();
    }
}
