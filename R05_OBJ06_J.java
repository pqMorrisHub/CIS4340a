public final class MutableDemo {
  // java.net.HttpCookie is mutable
  public void useMutableInput(HttpCookie cookie) {
    if (cookie == null) {
       throw new NullPointerException();
    }
 
    // Check whether cookie has expired
    if (cookie.hasExpired()) {
      // Cookie is no longer valid; handle condition by throwing an exception
    }
 
    // Cookie may have expired since time of check
    doLogic(cookie);
  }
}
