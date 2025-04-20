package online.devplanet.Basics.LLDpattern.SolidPrinciple.LSP.GoodCode.Example1;

public class WritableFile extends ReadableFile implements Writable{
    @Override
    public void write() {

        System.out.println("writing to a file");
    }
}
