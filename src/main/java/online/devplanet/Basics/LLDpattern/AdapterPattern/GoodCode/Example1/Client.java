package online.devplanet.Basics.LLDpattern.AdapterPattern.GoodCode.Example1;

import online.devplanet.Basics.LLDpattern.AdapterPattern.GoodCode.Example1.Adaptee.WeightMachineForBabies;
import online.devplanet.Basics.LLDpattern.AdapterPattern.GoodCode.Example1.Adapter.WeightMachineAdapter;
import online.devplanet.Basics.LLDpattern.AdapterPattern.GoodCode.Example1.Adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
