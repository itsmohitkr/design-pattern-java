package online.devplanet.Basics.LLDpattern.ProxyDesignPattern;

public class EmployeeProxy implements EmployeeDAO{
    EmployeeDAO employeeDAOobj;
    EmployeeProxy(){
        employeeDAOobj= new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDAO obj) throws Exception{
        if(client.equals("ADMIN")){
            employeeDAOobj.create(client,obj);
            return;
        }
        throw new Exception("Access denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception{
        if(client.equals("ADMIN")){
            employeeDAOobj.delete(client,employeeId);
            return;
        }
        throw new Exception("Access denied");
    }

    @Override
    public EmployeeDAO get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDAOobj.get(client,employeeId);
        }
        throw  new Exception("Access denied");
    }
}
