package net.decentered.stuff.lissajous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class AutoPhaseActionListener implements ActionListener {
    private AutoPhase timerTaskAutoPhase = null;
    private final Timer timer = new Timer();
    private final JSlider phaseSlider;

    public AutoPhaseActionListener(JSlider phaseSlider) {
        this.phaseSlider = phaseSlider;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JCheckBox autoPhase = (JCheckBox) e.getSource();

        if(autoPhase.isSelected()) {

            if(timerTaskAutoPhase == null) {
                timerTaskAutoPhase = new AutoPhase(phaseSlider);
            }
            timer.schedule(timerTaskAutoPhase, 50, 50);
        }
        else {
            if(timerTaskAutoPhase != null) {
                timerTaskAutoPhase.cancel();
                timerTaskAutoPhase = null;
            }
        }
    }

}