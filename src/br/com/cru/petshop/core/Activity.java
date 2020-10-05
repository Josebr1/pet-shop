package br.com.cru.petshop.core;


public interface Activity {
    /**
     * windowActivated(WindowEvent e)
     * @param evt
     */
    void onCreate(java.awt.event.WindowEvent evt);

    /**
     * windowOpened(java.awt.event.WindowEvent evt);
     * @param evt
     */
    void onResume(java.awt.event.WindowEvent evt);

    /**
     * windowClosed(WindowEvent e)
     * @param evt
     */
    void onClose(java.awt.event.WindowEvent evt);

    /**
     * Inicializa os controllers
     */
    void onCreateControllers();

    /**
     *
     */
    void onCreateViews();
}
