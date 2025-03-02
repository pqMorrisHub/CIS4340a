class Dimensions {
  private int length;
  private int width;
  private int height;
  static public final int PADDING = 2;
  static public final int MAX_DIMENSION = 10;
 
  public Dimensions(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }
 
  protected int getVolumePackage(int weight) {
    length += PADDING;
    width  += PADDING;
    height += PADDING;
    try {
      if (length <= PADDING || width <= PADDING || height <= PADDING ||
        length > MAX_DIMENSION + PADDING || width > MAX_DIMENSION + PADDING ||
        height > MAX_DIMENSION + PADDING || weight <= 0 || weight > 20) {
        throw new IllegalArgumentException();
      }
 
      int volume = length * width * height;
      length -= PADDING; width -= PADDING; height -= PADDING; // Revert
      return volume;
    } catch (Throwable t) {
      MyExceptionReporter mer = new MyExceptionReporter();
      mer.report(t); // Sanitize
      return -1; // Non-positive error code
    }
  }
 
  public static void main(String[] args) {
    Dimensions d = new Dimensions(8, 8, 8);
    System.out.println(d.getVolumePackage(21)); // Prints -1 (error)
    System.out.println(d.getVolumePackage(19));
    // Prints 1728 (12x12x12) instead of 1000 (10x10x10)
  }
}
