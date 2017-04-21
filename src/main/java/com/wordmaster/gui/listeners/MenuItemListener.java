package com.wordmaster.gui.listeners;

import com.wordmaster.gui.GameFrame;
import org.apache.logging.log4j.LogManager;

import java.awt.event.ActionEvent;

public class MenuItemListener extends SoundButtonListener {
    protected GameFrame.Pane paneToShow;

    public MenuItemListener (GameFrame.Pane paneToShow) {
        super(SoundType.MENU);
        this.paneToShow = paneToShow;
    }
    public MenuItemListener () {
        super(SoundType.MENU);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        if (paneToShow == null) {
            // TODO: cleanup stuff
            LogManager.getLogger(this.getClass()).info("Application closed");
            System.exit(0);
        }
        GameFrame.getInstance().show(paneToShow);
    }
}
