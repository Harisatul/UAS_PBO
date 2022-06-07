package com.harisatul;

import com.harisatul.view.MainView;
import io.bretty.console.view.MenuView;

public class Main {

    public static void main(String[] args) {

        MenuView rootMenu = new MenuView("Welcome to Angry birds Games", "");
        rootMenu.addMenuItem(new MainView());
        rootMenu.display();

    }
}
