public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
 
}

public class Replace {
  public static void main(String[] args) {
    String original = "insecure";
    original = original.replace('i', '9');
    System.out.println(original);
  }
}
