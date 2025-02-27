/*
BigInteger x = new BigInteger("530500452766");
String s = x.toString();  // Valid character data
byte[] byteArray = s.getBytes();
String ns = new String(byteArray); 
x = new BigInteger(ns);

public static long getInteger (DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL ; // Mask with 32 one−bits
}
*/
