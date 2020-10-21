package br.com.cru.petshop.core;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JInternalFrame;

public abstract class JInternalFrameActivity extends JInternalFrame implements Activity  {
    
    public JInternalFrameActivity(){
        this.initialize();
        onCreateControllers();
        onCreateViews();    
    }
    
    private void initialize() {

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                onResume(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                onClose(e);
            }

            @Override
            public void windowIconified(WindowEvent e) {
                super.windowIconified(e);
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                super.windowDeiconified(e);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                onCreate(e);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
            }

            @Override
            public void windowStateChanged(WindowEvent e) {
                super.windowStateChanged(e);
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {
                super.windowGainedFocus(e);
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                super.windowLostFocus(e);
            }
        });

    }
}
