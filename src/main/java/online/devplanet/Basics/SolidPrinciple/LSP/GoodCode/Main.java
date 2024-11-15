package online.devplanet.Basics.SolidPrinciple.LSP.GoodCode;

public class Main {
    public static void readAnyFile(ReadableFile file){
        file.read();
    }
    public static void main(String [] args){
        WritableFile writableFile=new WritableFile();
        writableFile.write();
        writableFile.read();

        ReadableFile readableFile=new ReadOnlyFile();
        readableFile.read();

        readAnyFile(readableFile);
        readAnyFile(writableFile);

    }
}
