package br.com.cru.petshop.core;


public interface Activity<T> {
    /**
     * windowActivated(WindowEvent e)
     * @param evt
     */
    void onCreate(T evt);

    /**
     * windowOpened(java.awt.event.WindowEvent evt);
     * @param evt
     */
    void onResume(T evt);

    /**
     * windowClosed(WindowEvent e)
     * @param evt
     */
    void onClose(T evt);

    /**
     * Inicializa os controllers
     */
    void onCreateControllers();

    /**
     *
     */
    void onCreateViews();
}
