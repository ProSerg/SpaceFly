package ru.home;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name_app="SpaceFly";
        BaseView view =  new BaseView(name_app);
        System.out.print(view.getTest());
    }
}

