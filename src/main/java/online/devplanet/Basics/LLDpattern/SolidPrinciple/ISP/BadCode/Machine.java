package online.devplanet.Basics.LLDpattern.SolidPrinciple.ISP.BadCode;


// Monolithic Machine interface
interface Machine {
    void print(Document doc);
    void scan(Document doc);
    void copy(Document doc);
}