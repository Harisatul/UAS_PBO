package com.harisatul.view;

import io.bretty.console.view.ActionView;
import io.bretty.console.view.MenuView;

public class MainView extends ActionView {


    public MainView() {
        super("Playing games",
                "play games");
    }

    @Override
    public void executeCustomAction() {
        MenuView menuView = new MenuView(
                "Choose World",
                "World ");
        menuView.setParentView(this);
        menuView.addMenuItem(new RockOfFireView(
                "World of fire : arena of death",
                "World Of Fire"));
        menuView.addMenuItem(new FrizzieHillView(
                "Frezzie Hill : Snow will kill you",
                "Frizzie Hill"));
        menuView.addMenuItem(new ForestView(
                "ForestView : there's lot trap ",
                "Forest"));
        menuView.display();
    }
}
