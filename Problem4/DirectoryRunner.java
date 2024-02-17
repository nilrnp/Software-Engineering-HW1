package Homework1.Problem4;

public class DirectoryRunner {
    public static void main(String[] args) {
        Folder demo1 = new Folder("demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        File remoteFiles = new File("Remote Files");

        demo1.addSubFolder(sourceFiles);
        demo1.addSubFolder(includePath);
        demo1.addFile(remoteFiles);

        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicF = new Folder("public");

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicF);

        File htAccess = new File(".htaccess");
        File htRouter = new File(".htrouter.php");
        File indexHTML = new File("index.html");

        publicF.addFile(htAccess);
        publicF.addFile(htRouter);
        publicF.addFile(indexHTML);

        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        System.out.println("\n1)");
        demo1.print(" ");
        app.delete();
        System.out.println("\n2)");
        demo1.print(" ");
        publicF.delete();
        System.out.println("\n3)");
        demo1.print(" ");

    }
}
