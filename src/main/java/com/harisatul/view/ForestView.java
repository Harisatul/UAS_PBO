package com.harisatul.view;

import com.harisatul.world.ForestWorld;
import io.bretty.console.view.ActionView;

public class ForestView extends ActionView {

    private ForestWorld forestWorld;

    public ForestView(String runningTitle, String nameInParentMenu) {
        super(runningTitle, nameInParentMenu);
        this.forestWorld =  new ForestWorld();
    }

    @Override
    public void executeCustomAction() {
        forestWorld.worldLogic();
    }
}
