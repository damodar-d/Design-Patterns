import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String directoryName;
    private List<FileSystem> list;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.list = new ArrayList<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void addToDirectory(FileSystem entity){
        this.list.add(entity);
    }

    public void ls(){
        System.out.println("Directory Name: "+this.directoryName);
        System.out.print("\t");
        for(FileSystem entity : list){
            System.out.print("\t");
            entity.ls();
        }
    }
}
