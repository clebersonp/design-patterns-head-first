package refactoring_guru.decorator.example;

import refactoring_guru.decorator.example.decorators.CompressionDecorator;
import refactoring_guru.decorator.example.decorators.DataSource;
import refactoring_guru.decorator.example.decorators.DataSourceDecorator;
import refactoring_guru.decorator.example.decorators.EncryptionDecorator;
import refactoring_guru.decorator.example.decorators.FileDataSource;

/**
 * Código cliente para testar os decorators
 * 
 * @author cleberson
 *
 */
public class Demo {

	public static void main(String[] args) {
		final String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
		
		final String targetFile = "outputDemo.txt";
		
		final DataSourceDecorator encoded = 
				new CompressionDecorator(
						new EncryptionDecorator(
								new FileDataSource(targetFile)));
		
		encoded.writeData(salaryRecords);
		final DataSource plain = new FileDataSource(targetFile);
		
		System.out.println("- Plain Input -------------------");
		System.out.println(salaryRecords);
		System.out.println("- Encoded -----------------------");
		System.out.println(plain.readData());
		System.out.println("- Decoded -----------------------");
		System.out.println(encoded.readData());
		
		
	}

}
