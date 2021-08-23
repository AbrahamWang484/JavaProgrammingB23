package day47_Recap.browsersTask;

public class Browser  {

    public void open(){
        System.out.println();
    }

    public void close(){
        System.out.println();
    }

    public final void navigate(String url){
        System.out.println("Type: "+url);
        System.out.println("Press Enter");
    }

    public final void refresh(){
        System.out.println("F5");
    }

    public final void backward(){
        System.out.println("backward");
    }

    public final void forward(){
        System.out.println("forward");
    }



}

/*
open()
close()
navigate()
refresh()
chrome1.navigate("google.com")
chrome2.navigate("facebook")
chrome1.refresh()
 */