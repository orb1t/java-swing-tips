package sun.awt.resources;

import java.util.ListResourceBundle;

// ant package
// cd target
// "%JAVA_HOME%\bin\java" -Xbootclasspath/p:example.jar -jar example.jar
@SuppressWarnings({"PMD.ClassNamingConventions", "checkstyle:typename"}) // Class names should begin with an uppercase character
public final class awt_ja extends ListResourceBundle {
  @Override protected Object[][] getContents() {
    System.out.println("---- awt_ja ----");
    return new Object[][] {{"AWT.space", "XXXXX"}};
  }
}
