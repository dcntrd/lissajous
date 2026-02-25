package net.decentered.stuff.lissajous;

import javax.swing.*;
import java.util.TimerTask;

public class AutoPhase extends TimerTask {

    JSlider phase;
    public AutoPhase(JSlider phase) {
        this.phase = phase;
    }

    @Override
    public void run() {
        if(phase.getValue() == phase.getMaximum()) {
            phase.setValue(phase.getMinimum());
        } else {
            phase.setValue(phase.getValue() + 1);
        }
    }

}