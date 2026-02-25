package net.decentered.stuff.lissajous.panel;

import net.decentered.stuff.lissajous.AutoPhaseActionListener;

import javax.swing.*;
import java.awt.*;

public class ParameterPanel extends JPanel {

    public ParameterPanel(ParameterChangedListener listener) {

        setLayout(new GridLayout(4, 2, 5, 5));
        setBorder(BorderFactory.createLineBorder(getBackground(), 15));

        Label xLabel = new Label("X:");
        JSlider  xSlider = new JSlider(1, 10);
        xSlider.setMajorTickSpacing(1);
        xSlider.setPaintTicks(true);
        xSlider.addChangeListener(e -> {
            xLabel.setText("X: " + xSlider.getValue());
            listener.xChanged(xSlider.getValue());
        });
        xSlider.setValue(2);

        Label yLabel = new Label("Y:");
        JSlider  ySlider = new JSlider(1, 10);
        ySlider.setMajorTickSpacing(1);
        ySlider.setPaintTicks(true);
        ySlider.addChangeListener(e -> {
            yLabel.setText("Y: " + ySlider.getValue());
            listener.yChanged(ySlider.getValue());
        });
        ySlider.setValue(3);

        JLabel phaseLabel = new JLabel("Phase:");
        JSlider phaseSlider = new JSlider(0, 359);
        phaseSlider.setMajorTickSpacing(15);
        phaseSlider.setPaintTicks(true);
        phaseSlider.addChangeListener(e -> {
            phaseLabel.setText("Phase: " + phaseSlider.getValue());
            listener.phaseChanged(phaseSlider.getValue());
        });
        phaseSlider.setValue(0);

        JCheckBox autoPhase = new JCheckBox("Auto Phase");
        autoPhase.addActionListener(new AutoPhaseActionListener(phaseSlider));

        add(xLabel);
        add(xSlider);
        add(yLabel);
        add(ySlider);
        add(phaseLabel);
        add(phaseSlider);
        add(autoPhase);
    }

}
