class Base {
  static DateFormat format =
      DateFormat.getDateInstance(DateFormat.MEDIUM);
 
  public Date parse(String str) throws ParseException {
    try {
      synchronized (Class.forName("Base")) {
        return format.parse(str);
      }
    } catch (ClassNotFoundException x) {
      // "Base" not found; handle error
    }
    return null;
  }
}
