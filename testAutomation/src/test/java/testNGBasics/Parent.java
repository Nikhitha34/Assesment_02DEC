package testNGBasics;

public class Parent {
    String name="Parent";
    public void launchBrowser() {System.out.print("Browser launched");}


    public void launchBrowser(String browserName){
        System.out.print("browser launched");
    }

    public void launchBrowser(int value){
        System.out.print("browser launched");
    }
}
