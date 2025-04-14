package online.devplanet.Basics.LLDpattern.ProxyDesignPattern;

public interface EmployeeDAO {
    public void create(String client, EmployeeDAO obj) throws Exception;
    public void delete(String client, int employeeId) throws Exception;
    public EmployeeDAO get(String client, int employeeId) throws Exception;
}
