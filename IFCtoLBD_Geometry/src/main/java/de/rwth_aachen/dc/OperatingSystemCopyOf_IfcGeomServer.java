package de.rwth_aachen.dc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermissions;

public class OperatingSystemCopyOf_IfcGeomServer {

    public static String getIfcGeomServer() {

        String OS = System.getProperty("os.name").toLowerCase();
        String IfcGeomServerLocation = null;
        boolean os64bit = false;
        boolean ixsystem = false;

        System.out.println("OS is: " + OS);

        if (System.getProperty("sun.arch.data.model").equals("64"))
            os64bit = true;

        if (OS.contains("win"))
            if (os64bit)
                IfcGeomServerLocation = "/exe/64/win/IfcGeomServer.exe";
            else
                IfcGeomServerLocation = "/exe/32/win/IfcGeomServer.exe";

        if (OS.contains("mac")) {
            ixsystem = true;
            IfcGeomServerLocation = "/exe/64/osx/IfcGeomServer";
            ;
        }

        if (OS.contains("nix") || OS.contains("nux") || OS.contains("aix")) {
            ixsystem = true;
            if (os64bit)
                IfcGeomServerLocation = "/exe/64/linux/IfcGeomServer";
            else
                IfcGeomServerLocation = "/exe/32/linux/IfcGeomServer";
        }

        if (OS.contains("sunos")) {
            ixsystem = true;
            if (os64bit)
                IfcGeomServerLocation = "/exe/64/linux/IfcGeomServer";
            else
                IfcGeomServerLocation = "/exe/32/linux/IfcGeomServer";
        }
        String tempPath = System.getProperty("java.io.tmpdir");

        if (!tempPath.endsWith(File.separator))
            tempPath += File.separator;
        if (ixsystem)
            tempPath += "IfcGeomServer";
        else
            tempPath += "IfcGeomServer.exe";
        Path geomserverPath = Paths.get(tempPath);
        // if (!geomserverPath.toFile().exists())
        if (IfcGeomServerLocation != null) {
            InputStream in = OperatingSystemCopyOf_IfcGeomServer.class.getResourceAsStream(IfcGeomServerLocation);
            if (in == null)
                in = OperatingSystemCopyOf_IfcGeomServer.class.getResourceAsStream("/resources" + IfcGeomServerLocation);
            try {
                Files.copy(in, geomserverPath, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e1) {
                System.out.println("IfcGeomServerLocation null?: " + (IfcGeomServerLocation == null));
                System.out.println("IfcGeomServerLocation: " + IfcGeomServerLocation);
                System.out.println("in null?: " + (in == null));
                System.out.println("geomserverPath null?: " + (geomserverPath == null));
                System.out.println("geomserverPath: " + geomserverPath);
                e1.printStackTrace();
            }

            if (ixsystem) {
                try {
                    Files.setPosixFilePermissions(geomserverPath, PosixFilePermissions.fromString("rwxrwxrwx"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else
            System.out.println("Undefined");

        return geomserverPath.toString();
    }

    public static void main(String[] args) {
        new OperatingSystemCopyOf_IfcGeomServer();
    }

}
