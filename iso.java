import java.util.HashMap;
import java.util.Map;
public class iso {

  public boolean isIsomorphic(String a, String b) {
    if(a == null || b == null) {
      return false;
    }
    if(a.length() != b.length()) {
      return false;
    }
    Map<Character, Character> characterMap = new HashMap<Character, Character>();
    for(int i=0; i<a.length(); i++) {
      char c1 = a.charAt(i);
      char c2 = b.charAt(i);
      if(characterMap.containsKey(c1)) {
        if(characterMap.get(c1) != c2) {
          return false;
        }
      } else {
        if(characterMap.containsValue(c2)) {
          return false;
        }
        characterMap.put(c1, c2);
      }
    }
    return true;
  }

  public static void main(String args[]) {
    iso iso1 = new iso();
      String a = "egg";
      String b = "add";

      String c = "foo";
      String d = "bar";

      String e = "paper";
      String f = "title";

      System.out.println(iso1.isIsomorphic(a,b));
      System.out.println(iso1.isIsomorphic(c,d));
      System.out.println(iso1.isIsomorphic(e,f));
  }
}
