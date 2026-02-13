package net.decentered.stuff.lissajous;

import net.decentered.stuff.lissajous.panel.CurvePanel;
import net.decentered.stuff.lissajous.panel.ParameterPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("Lissajous");
        setSize(1200, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CurvePanel curvePanel = new CurvePanel();
        add(curvePanel, BorderLayout.CENTER);

        ParameterPanel parameterPanel = new ParameterPanel();
        add(parameterPanel, BorderLayout.SOUTH);

    }
}
