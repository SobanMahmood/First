package net.viralpatel.qrcode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeJava {
    public static void main(String[] args) {
        ByteArrayOutputStream out = QRCode.from("Alpha Beta Gamma")
                                        .to(ImageType.PNG).stream();
 
        
        
        String temp = new String();
        temp = "Humpty Dumpty";
        temp = "BOOTS";
try {
            FileOutputStream fout = new FileOutputStream(new File(
                    "D:\\QR_Code.PNG"));
 
            fout.write(out.toByteArray());
            
            fout.flush();
            fout.close();
            
 
        } catch (FileNotFoundException e) {
            // Do Logging
        	e.printStackTrace();
        } catch (IOException e) {
            // Do Logging
        	e.printStackTrace();
        }
    }
}
