package com.harisatul.view;

import com.harisatul.world.RockOfFireWorld;
import io.bretty.console.view.ActionView;

public class RockOfFireView extends ActionView {

    private RockOfFireWorld rockOfFireWorld;

    public RockOfFireView(String runningTitle, String nameInParentMenu) {
        super(runningTitle, nameInParentMenu);
        this.rockOfFireWorld =  new RockOfFireWorld();
    }

    @Override
    public void executeCustomAction() {
        rockOfFireWorld.worldLogic();
    }
}
