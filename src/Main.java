import java.io.File;

public class Main {
    private static String path1 = "D:" + File.separator + "Games" + File.separator;
    private static String path2 = "D:" + File.separator + "Games" + "src" + File.separator;
    private static String path3 = "D:" + File.separator + "Games" + "res" + File.separator;
    private static String path4 = "D:" + File.separator + "Games" + "src" + File.separator + "main" + File.separator;
    private static String path5 = "D:" + File.separator + "Games" + "temp" + File.separator;
    private static StringBuilder forDirectoriesAndFiles = new StringBuilder();
    static String separator = System.lineSeparator();


    public static void main(String[] args) {
        //В папке Games создайте несколько директорий: src, res, savegames, temp.
        createSrcDirectory("src");
        createResDirectory("res");
        createSaveGamesDirectory("savegames");
        createTempDirectory("temp");
        //В каталоге src создайте две директории: main, test
        createMainDirectory("main");
        createTestDirectory("test");
    }

    public static void createSrcDirectory(String nameDir) {
        File src = new File(path1 + nameDir);
        if (src.mkdir()) {
            forDirectoriesAndFiles.append("Директория " + src.getName() + " была создана");
        }
    }

    public static void createResDirectory(String nameDir) {
        File res = new File(path1 + nameDir);
        if (res.mkdir()) {
            forDirectoriesAndFiles.append(separator).append("Директория " + res.getName() + " была создана");
        }
    }

    private static void createSaveGamesDirectory(String nameDir) {
        File saveGames = new File(path1 + nameDir);
        if (saveGames.mkdir()) {
            forDirectoriesAndFiles.append("Директория " + saveGames.getName() + " была создана");
        }
    }

    private static void createTempDirectory(String nameDir) {
        File temp = new File(path1 + nameDir);
        if (temp.mkdir()) {
            forDirectoriesAndFiles.append(separator).append("Директория " + temp.getName() + " была создана");
        }
    }

    private static void createMainDirectory(String nameDir) {
        File main = new File(path2 + nameDir);
        if (main.mkdir()) {
            forDirectoriesAndFiles.append(separator).append("Директория " + main.getName() + " была создана");
        }
    }
    private static void createTestDirectory(String nameDir) {
        File test = new File(path2 + nameDir);
        if (test.mkdir()) {
            forDirectoriesAndFiles.append("Директория " + test.getName() + " была создана");
        }
    }
}


