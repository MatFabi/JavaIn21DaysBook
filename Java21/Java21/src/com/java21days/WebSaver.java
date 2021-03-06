/* RozwiÄ…zanie dla rozdziaĹ‚ 17., Ä‡wiczenie 2. */

package com.java21days;

import java.net.*;
import java.io.*;

public class WebSaver {
    URL page;

    public WebSaver(String address) throws MalformedURLException {
        page = new URL(address);
    }

    void getData() {
        // Utworzenie obiektu pliku.
        String filename = page.getHost() + "_" + page.getFile() + "_file.html";
        File output = new File(filename);
        try {
            // Utworzenie strumienia wyjĹ›ciowego,
            FileWriter fw = new FileWriter(output);
            BufferedWriter out = new BufferedWriter(fw);
            StringBuilder text = new StringBuilder();
            HttpURLConnection conn = (HttpURLConnection)
                page.openConnection();
            conn.connect();
            InputStreamReader in = new InputStreamReader(
                (InputStream) conn.getContent());
            BufferedReader buff = new BufferedReader(in);
            String line;
            do {
                line = buff.readLine();
                if (line != null) {
                    out.write(line, 0, line.length());
                }
            } while (line != null);
            out.flush();
            out.close();
            System.out.println(output.getName() + " zapisany");
        } catch (IOException ioe) {
            System.out.println("BĹ‚Ä…d wejĹ›cia-wyjĹ›cia:" + ioe.getMessage());
        }
    }

    public static void main(String[] arguments) {
        if (arguments.length < 1) {
            System.out.println("UĹĽycie: java WebSaver url");
            System.exit(1);
        }
        try {
            WebSaver app = new WebSaver(arguments[0]);
            app.getData();
        } catch (MalformedURLException mue) {
            System.out.println("BĹ‚Ä…d URL: " + arguments[0]);
        }
    }
}
