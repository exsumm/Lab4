/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
 /** .
  *  ReclamationProject - the name of this project
 */

public class ReclamationProject {
    /** .
     * @param a - input by user
     * @param b - input by user
     * @return doit - processing body
     */
    static String doit(final String a, final String b) {
        String r = "";
        String c = b;
        String d = a;
        if (a.length() > b.length()) {
            c = a; //exchange the value of a and b
            d = b;
         }
        /*
         * For loop with i
         */
        for (int i = 0; i < d.length(); i++) {
            for (int j = d.length() - i; j > 0; j--) {
                for (int k = 0; k < c.length() - j; k++) {
                    if (d.regionMatches(i, c, k, j)) {
                         if (j > r.length()) {
                             r = d.substring(i, i + j);
                        }
                    }
                        }
                }
        }
        return r;
        }
}
