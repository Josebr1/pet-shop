package br.com.cru.petshop.utils;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class InternalFrameUtils {
    
    /***
     * 
     * @param frame
     * @param pane 
     */
    public static void init(JInternalFrame frame, JDesktopPane pane){
        if (frame.isVisible()) {
            frame.toFront();
            frame.requestFocus();
        } else {
            pane.add(frame);
            centerScreen(frame, pane);
            frame.setVisible(true);
        }
    }
    
    /**
     * 
     * @param frame
     * @param pane 
     */
    private static void centerScreen(JInternalFrame frame, JDesktopPane pane) {
        Dimension desktopSize = pane.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
        (desktopSize.height- jInternalFrameSize.height)/2);
    }
}
