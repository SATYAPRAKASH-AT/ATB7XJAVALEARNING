package Ex_OOPS_Abstraction.RealEx;

public class Lab01 {
    public static void main(String[] args) {
        TC1_CHROME chrome = new TC1_CHROME();
        chrome.openBrowser();
        chrome.closeBrowser();
        chrome.printLog();

        TC2_FIREFOX firefox = new TC2_FIREFOX();
        firefox.openBrowser();
    }
}
