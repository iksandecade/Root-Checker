package example.iksandecade.libs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

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

    private static void showDialog(Context context) {

        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Warning")
                .setMessage("Your device has been rooted. Rooted device is not supported by our developer and may caused problems with this application.")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public static void checkRoot(Context context) {
        if (findBinary("su")) {
            showDialog(context);
        }
    }

}
