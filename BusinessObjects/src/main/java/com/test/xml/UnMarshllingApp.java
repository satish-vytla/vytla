package com.test.xml;

/*import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.test.bankapp.student.Address;
import com.test.bankapp.student.Student;*/

public class UnMarshllingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		/*JAXBContext jc = JAXBContext.newInstance("com.test.bankapp.student");
		
		//Marshall
		Student student = new Student(101,"Jhon",4500,new Address("Plymouth", "55447")) ;
		
		Marshaller marshaller = jc.createMarshaller();
		
		marshaller.marshal(student, System.out);
		
		//Un Marshall
		String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Student xmlns=\"http://www.test.com/bankapp/student\"><sno>101</sno><sname>Jhon</sname><course>4500.0</course><Address><city>Plymouth</city><zip>55447</zip></Address></Student>";
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		Student student = (Student)unmarshaller.unmarshal(new StringReader(xmlData));
		System.out.println(student);*/
	}

}

