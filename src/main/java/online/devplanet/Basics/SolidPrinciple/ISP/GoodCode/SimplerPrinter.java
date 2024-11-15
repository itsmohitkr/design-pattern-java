package online.devplanet.Basics.SolidPrinciple.ISP.GoodCode;

public class SimplerPrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }
}
