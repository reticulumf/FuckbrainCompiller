import compiler.*;
import compiler.commands.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.nio.charset.Charset;

public class Application {
    public void start() {
        FuckBrainCodeParser fuckBrainCodeParser = new FuckBrainCodeParser();
        fuckBrainCodeParser.setCode(readCode(openFile()));
        fuckBrainCodeParser.executeCode();
    }

    private String readCode(File file) {
        String code = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getPath()), Charset.forName("UTF-8")));
            code = reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return code;
    }

    private File openFile(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("text files", "txt", "text");
        fileChooser.setFileFilter(filter);
        int ret = fileChooser.showDialog(null, "open file with brain fuck code(without cycles)");
        if (ret == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return fileChooser.getSelectedFile();
    }
}
