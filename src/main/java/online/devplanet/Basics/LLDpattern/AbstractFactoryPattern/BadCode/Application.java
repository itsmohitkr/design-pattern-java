package online.devplanet.Basics.LLDpattern.AbstractFactoryPattern.BadCode;
class WindowsButton {
    public void render() {
        System.out.println("rendering Windows button");
    }
}
class WindowsScrollBar {
    public void render() {
        System.out.println("scrolling Windows scroll bar");
    }
}
// create for mac UI components
class MacButton {
    public void render() {
        System.out.println("rendering Mac button");
    }
}
class MacScrollBar {
    public void render() {
        System.out.println("scrolling Mac scroll bar");
    }
}
public class Application {
    public static void main(String[] args) {
        // create windows button and scroll bar
        WindowsButton windowsButton = new WindowsButton();
        WindowsScrollBar windowsScrollBar = new WindowsScrollBar();
        windowsButton.render();
        windowsScrollBar.render();

        // create mac button and scroll bar
        MacButton macButton = new MacButton();
        MacScrollBar macScrollBar = new MacScrollBar();
        macButton.render();
        macScrollBar.render();
    }
}
