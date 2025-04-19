package online.devplanet.Basics.LLDpattern.CompositeDesignPattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object>objectsList;

    public Directory(String name){
        this.directoryName = name;
        objectsList= new ArrayList<>();
    }

    public void add(Object object){
        objectsList.add(object);
    }

    public void ls(){
        System.out.println("Directory name " + directoryName);
        for (Object object : objectsList) {
            if (object instanceof File) {
                ((File) object).ls();
            } else if (object instanceof Directory) {
                ((Directory) object).ls();
            }
        }
    }

}
