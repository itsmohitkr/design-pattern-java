package online.devplanet.Basics.LLDpattern.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDAO{

    @Override
    public void create(String client, EmployeeDAO obj) {
        System.out.println("created new row in the DB");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("employee deleted: "+ employeeId);
    }

    @Override
    public EmployeeDAO get(String client, int employeeId) {
        System.out.println("fetching data from the db");
        return new EmployeeDaoImpl();
    }

}

