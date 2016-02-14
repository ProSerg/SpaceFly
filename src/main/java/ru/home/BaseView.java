package ru.home;

import javax.swing.*;

/**
 * Created by markin on 09.02.2016.
 */
public class BaseView extends JFrame {
    final String text = "Pppp!";
    final int pos_x=200;
    final int pos_y=300;
    final int width=300;
    final int height=300;

    BaseView(String title) {
        setTitle(title);
        setBounds(pos_x,pos_y,width,height);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public String getTest() {
        return this.text;
    }
}
