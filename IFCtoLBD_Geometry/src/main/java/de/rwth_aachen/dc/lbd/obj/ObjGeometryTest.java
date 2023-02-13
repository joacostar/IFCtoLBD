package de.rwth_aachen.dc.lbd.obj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.renderengine.RenderEngineException;

import de.rwth_aachen.dc.lbd.ObjDescription;

public class ObjGeometryTest {

	public static void main(String[] args) {
		try {
			IFCtoObj ib=new IFCtoObj(new File("c:\\ifc\\Project1.ifc"));
			ObjDescription b=ib.getOBJ("2XR7ZJ3vvFfQ0vDTZymDVE");
			FileOutputStream outputStream = new FileOutputStream("c:\\jo\\test.obj");
		    byte[] strToBytes = b.toString().getBytes();
		    outputStream.write(strToBytes);

		    outputStream.close();
		    System.out.println(b);
		} catch (RenderEngineException | DeserializeException | IOException e) {
			e.printStackTrace();
		}
		System.exit(1);

	}

}
