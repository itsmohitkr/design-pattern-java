package online.devplanet.Basics.LLDpattern.ProxyDesignPattern;

public class Main {

    public static void main(String[] args) {
        try {
            EmployeeDAO daoObj= new EmployeeProxy();
            daoObj.create("USER", daoObj);
            System.out.println("operation successful");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
