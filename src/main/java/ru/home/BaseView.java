package ru.home;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by markin on 09.02.2016.
 */
public class BaseView extends Frame {
    final String text = "Pppp!";
    BaseView(String title) {
        super();
        this.setTitle(title);
        this.setVisible(true);
        this.setSize(300,300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
                System.exit(0);
            }
        });
    }
    public String getTest() {
        return this.text;
    }
}
