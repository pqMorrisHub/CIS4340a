
class Base {
  static DateFormat format =
      DateFormat.getDateInstance(DateFormat.MEDIUM);
 
  public Date parse(String str) throws ParseException {
    synchronized (getClass()) {
      return format.parse(str);
    }
  }
}
 
class Derived extends Base {
  public Date doSomethingAndParse(String str) throws ParseException {
    synchronized (Base.class) {
      // ...
      return format.parse(str);
    }
  }
}
