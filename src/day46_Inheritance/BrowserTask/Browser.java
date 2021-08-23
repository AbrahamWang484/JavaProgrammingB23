package day46_Inheritance.BrowserTask;

public class Browser {
    public String name;

    public Browser(String name) {
        this.name = name;
    }

    public void openBrowser(){
        System.out.println("opening "+name+" browser");
    }
    public void closeBrowser(){
        System.out.println("closing "+name+" browser");
    }
}
/*
BrowserTask
	Create the following custom classes:
	1. Chrome
			methods:
				openBrowser(): prints "opening chrome browser"
				closeBrowser(): prints "closing chrome browser"

	2. FireFox
			methods:
				openBrowser(): prints "opening firefox browser"
				closeBrowser(): prints "closing fire fox browser"

	3. Opera
			methods:
				openBrowser(): prints "opening opera browser"
				closeBrowser(): prints "closing opera browser"

	4. Safari
			methods:
				openBrowser(): prints "opening safari browser"
				closeBrowser(): prints "closing safari browser"
 */