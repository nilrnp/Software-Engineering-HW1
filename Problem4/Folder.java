package Homework1.Problem4;

import java.util.ArrayList;
import java.util.List;

class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void print(String indent) {
        System.out.println(indent + "Folder: " + name);

        for (File file : files) {
            file.print(indent + "\t");
        }

        for (Folder subFolder : subFolders) {
            subFolder.print(indent + "\t");
        }
    }

    public void delete() {
        for (Folder subFolder : new ArrayList<>(subFolders)) {
            subFolder.delete();
            subFolders.remove(subFolder);
        }

        for (File file : new ArrayList<>(files)) {
            files.remove(file);
        }
    }
}