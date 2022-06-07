package com.harisatul.view;

import com.harisatul.world.FrizzieHillWorld;
import io.bretty.console.view.ActionView;

public class FrizzieHillView extends ActionView {

    private FrizzieHillWorld frizzieHill;

    public FrizzieHillView(String runningTitle, String nameInParentMenu) {

        super(runningTitle, nameInParentMenu);
        this.frizzieHill = new FrizzieHillWorld();
    }

    @Override
    public void executeCustomAction() {
        frizzieHill.worldLogic();
    }
}
