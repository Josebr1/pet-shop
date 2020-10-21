package br.com.cru.petshop.core;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public abstract class JInternalFrameActivity extends JInternalFrame implements Activity<InternalFrameEvent>  {
    
    public JInternalFrameActivity(){
        this.initialize();
        onCreateControllers();
        onCreateViews();    
    }
    
    private void initialize() {

        addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                onCreate(e);
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                onClose(e);
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                onResume(e);
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
            }
        });
    }
}
