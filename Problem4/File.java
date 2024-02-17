package Homework1.Problem4;


class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(String indent) {
        System.out.println(indent + "File: " + name);
    }
}
