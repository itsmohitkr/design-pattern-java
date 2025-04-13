package online.devplanet.Basics.LLDpattern.AbstractFactoryPattern.GoodCode;
interface Button {
    void render();
}
interface ScrollBar {
    void render();
}

class windowButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}
class windowScrollBar implements ScrollBar {
    @Override
    public void render() {
        System.out.println("Rendering Windows ScrollBar");
    }
}
class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}
class MacScrollBar implements ScrollBar {
    @Override
    public void render() {
        System.out.println("Rendering Mac ScrollBar");
    }
}

// Abstract Factory
interface UIfactory {
    Button createButton();
    ScrollBar createScrollBar();
}

// create for windows UI components
class WindowsUIFactory implements UIfactory {
    @Override
    public Button createButton() {
        return new windowButton();
    }
    @Override
    public ScrollBar createScrollBar() {
        return new windowScrollBar();
    }
}

// create for mac UI components
class MacUIFactory implements UIfactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }
}

public class Application {
    private Button button;
    private ScrollBar scrollBar;

    public Application(UIfactory factory){
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }
    public void renderUI(){
        button.render();
        scrollBar.render();
    }
    public static void main(String[] args) {

        Application application = new Application(new WindowsUIFactory());

        application.renderUI();

    }
}
