package online.devplanet.Basics.LLDpattern.AdapterPattern.GoodCode.Example1.Adapter;

import online.devplanet.Basics.LLDpattern.AdapterPattern.GoodCode.Example1.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        return weightMachine.getWeightInPounds()*0.45;
    }
}
