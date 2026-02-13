package net.decentered.stuff.lissajous.panel;

import javax.swing.*;
import java.awt.*;

public class ParameterPanel extends JPanel {

    public ParameterPanel() {

        setLayout(new GridLayout(3,2, 5,5));
        setBorder(BorderFactory.createLineBorder(getBackground(), 15));

        Label xLabel = new Label("X:");
        JSlider  xSlider = new JSlider(1, 10, 1);
        xSlider.setMajorTickSpacing(1);
        xSlider.setPaintTicks(true);

        Label yLabel = new Label("Y:");
        JSlider  ySlider = new JSlider(1, 10, 1);
        ySlider.setMajorTickSpacing(1);
        ySlider.setPaintTicks(true);

        JLabel phaseLabel = new JLabel("Phase:");
        JSlider phaseSlider = new JSlider(0, 360, 0);
        phaseSlider.setMajorTickSpacing(15);
        phaseSlider.setPaintTicks(true);

        add(xLabel);
        add(xSlider);
        add(yLabel);
        add(ySlider);
        add(phaseLabel);
        add(phaseSlider);

    }
}
