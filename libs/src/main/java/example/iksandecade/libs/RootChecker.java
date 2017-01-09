package example.iksandecade.libs;

import java.io.File;

/**
 * Created by
 * Name         : Ihksan Sukmawan
 * Alias        : iksandecade
 * Email        : iksandecade@gmail.com
 * Company      : Meridian.id
 * Date         : 09-Jan-17
 * Project      : RootCheker
 */

public class RootChecker {

    public static boolean isRooted() {
        return findBinary("su");
    }

    private static boolean findBinary(String bynaryName) {
        boolean found = false;
        if (!found) {
            String[] places = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/",
                    "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (String where : places) {
                if (new File(where + bynaryName).exists()) {
                    found = true;
                    break;
                }
            }
        }
        
        return found;
    }

}
