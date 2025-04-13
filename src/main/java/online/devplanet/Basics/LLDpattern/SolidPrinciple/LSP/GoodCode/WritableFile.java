package online.devplanet.Basics.LLDpattern.SolidPrinciple.LSP.GoodCode;

public class WritableFile extends ReadableFile implements Writable{
    @Override
    public void write() {

        System.out.println("writing to a file");
    }
}
