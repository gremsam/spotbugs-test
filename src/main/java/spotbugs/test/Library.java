/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package spotbugs.test;

import javax.annotation.Nonnull;
import javax.annotation.CheckForNull;

public class Library {
    public boolean someLibraryMethod() {
        Integer temp = foo();
        if (temp == null) {
          return false;
        }
        return true;
    }

    @Nonnull
    private Integer foo() {
      return 5;
    }
}
