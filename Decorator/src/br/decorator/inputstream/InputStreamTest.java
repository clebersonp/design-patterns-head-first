package br.decorator.inputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		int c;
		// Anexando responsabilidade adicional ao objeto BufferedInputStream
		// alterando para lowercase os caracteres.
		// alternativa flexivel para subclasses por extensao de funcionalidade
		try (final InputStream in = new LowerCaseInputStream(
				new BufferedInputStream(new FileInputStream("test_inputstream.txt")))) {

//			while ((c = in.read()) >= 0) {
//				System.out.print((char) c);
//			}

			byte[] b = new byte[256];
			int off = 0;
			int length = b.length;
			c = in.read(b, off, length);
			for (int i = off; i < off + c; i++) {
				System.out.print((char) b[i]);
			}

		}
	}
}
