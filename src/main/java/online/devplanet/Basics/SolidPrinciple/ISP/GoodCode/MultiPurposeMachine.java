package online.devplanet.Basics.SolidPrinciple.ISP.GoodCode;

public class MultiPurposeMachine implements Printer,Scanner,Copier {
    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");

    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scan document...");

    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copy document...");
    }
}