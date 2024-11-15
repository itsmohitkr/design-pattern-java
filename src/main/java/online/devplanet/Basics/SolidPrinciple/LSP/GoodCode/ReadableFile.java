package online.devplanet.Basics.SolidPrinciple.LSP.GoodCode;

public class ReadableFile implements Readable{

    @Override
    public void read() {
        System.out.println("reading to a file");
    }
}
