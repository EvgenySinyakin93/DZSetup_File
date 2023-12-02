import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //cоздаем папки src, main, test и файлы Main,Utils
        if (createDir(sb, "Games/src")) {
            if (createDir(sb, "Games/src/main")) {
                createFile(sb, "Games/src/main/Main.java");
                createFile(sb, "Games/src/main/Utils.java");
            }
            createDir(sb, "Games/src/test");
        }
        //cоздаем папку res и три директории: drawables, vectors, icons.
        if (createDir(sb, "Games/res")) {
            createDir(sb, "Games/res/drawables");
            createDir(sb, "Games/res/vectors");
            createDir(sb, "Games/res/icons");
        }
        //cоздаем папку savegames
        createDir(sb, "Games/savegames");
        //cоздаем папку temp и текстовый файл внутри
        if (createDir(sb, "Games/temp")) {
            if (createFile(sb, "Games/temp/temp.txt")) {
                try (FileWriter writer = new FileWriter("Games/temp/temp.txt", false)) {
                    writer.write(sb.toString());
                    writer.flush(); //Метод выводит данные из буфера и помещает их в предназначенное для них место
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    //метод создания директорий
    public static boolean createDir(StringBuilder sb, String dirPath) {
        File dir = new File(dirPath);
        if (dir.mkdir()) {
            sb.append("Каталог " + dirPath + " создан успешно");
            return true;
        } else {
            sb.append("Каталог " + dirPath + " не был создан");
            return false;
        }
    }

    //метод создания файлов
    public static boolean createFile(StringBuilder sb, String fileName) {
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                sb.append("Файл " + fileName + " создан успешно");
                return true;
            }
        } catch (IOException ex) {
            sb.append("Файл " + fileName + " не был создан");
        }
        return false;
    }
}

