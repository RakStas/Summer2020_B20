package Day51Expections.BrouserTask.BruwsersTask.Browser;

public class FireFox extends WebDriver {
    public void get(String url){
        System.out.println("Opening the "+url+" in FireFox browser");

    }
    public void close(){
        System.out.println("Closing the FireFox browser");

    }
}
