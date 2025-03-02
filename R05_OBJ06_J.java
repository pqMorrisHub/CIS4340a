public final class MutableDemo {
  // java.net.HttpCookie is mutable
  public void useMutableInput(HttpCookie cookie) {
    if (cookie == null) {
      throw new NullPointerException();
    }
 
    // Create copy
    cookie = (HttpCookie)cookie.clone();
 
    // Check whether cookie has expired
    if (cookie.hasExpired()) {
      // Cookie is no longer valid; handle condition by throwing an exception
    }
 
    doLogic(cookie);
  }
}
