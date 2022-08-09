package com.nowcoder.community;

import java.io.IOException;

/**
 * @author GuoJiaming
 * @version 1.0
 */
public class WkTests {

    public static void main(String[] args) {
        String cmd = "D:/JAVA/DevelopmentEnvir/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com D:/JAVA/data/wk-image/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
