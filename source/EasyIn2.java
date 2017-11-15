//package javaclasses;

import java.io.*;

public class EasyIn2 {

	String readTrimmedLine() {
		while(true) {
			try {
				byte[] line = new byte[512];
				int pos = 0;
				while(true) {
					int b = System.in.read();
					if(b == -1) {
						System.out.println("End of input reached. Goodbye.");
						System.exit(1);
					}
					line[pos] = (byte)b;
					pos++;
					if(b == '\n' || pos == 512) {
						return new String(line).trim();
					}
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public  String getString() {
		boolean ok = false;
		String s = null;
		while (!ok) {
			s = readTrimmedLine();
			ok = true;
		}
		return s;
	}

	public  int getInt() {
		int i = 0;
		boolean ok = false;
		String s;
		while (!ok) {
			s = readTrimmedLine();
			try {
				i = Integer.parseInt(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter an integer");
			}
		}
		return i;
	}

	public  byte getByte() {
		byte i = 0;
		boolean ok = false;
		String s;
		while (!ok) {
			s = readTrimmedLine();
			try {
				i = Byte.parseByte(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter a byte");
			}
		}
		return i;
	}

	public  short getShort() {
		short i = 0;
		boolean ok = false;
		String s;
		while (!ok) {
			s = readTrimmedLine();
			try {
				i = Short.parseShort(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter a short integer");
			}
		}
		return i;
	}

	public  long getLong() {
		long l = 0;
		boolean ok = false;
		String s;
		while (!ok) {
			s = readTrimmedLine();
			try {
				l = Long.parseLong(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter a long integer");
			}
		}
		return l;
	}

	public  double getDouble() {
		double d = 0;
		boolean ok = false;
		String s;
		while (!ok) {
			s = readTrimmedLine();
			try {
				d = Double.parseDouble(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter a decimal number");
			}
		}
		return d;
	}

	public  float getFloat() {
		float f = 0;
		boolean ok = false;
		String s;
		while (!ok) {
			s = readTrimmedLine();
			try {
				f = Float.parseFloat(s.trim());
				ok = true;
			} catch (NumberFormatException e) {
				System.out.println("Make sure you enter a decimal number");
			}
		}
		return f;
	}

	public  char getChar() {
		char c = ' ';
		boolean ok = false;
		String s;
		while (!ok) {
			s = readTrimmedLine();
			if (s.trim().length() != 1) {
				System.out.println("Make sure you enter a single character");
			} else {
				c = s.trim().charAt(0);
				ok = true;
			}
		}
		return c;
	}

	public  void pause() {
		boolean ok = false;
		while (!ok) {
			readTrimmedLine();
			ok = true;
		}
	}

	public  void pause(String messageIn) {
		boolean ok = false;
		while (!ok) {
			System.out.print(messageIn);
			readTrimmedLine();
		}
	}
}
