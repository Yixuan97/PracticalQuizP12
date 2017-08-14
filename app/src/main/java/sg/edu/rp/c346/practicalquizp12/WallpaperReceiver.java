package sg.edu.rp.c346.practicalquizp12;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.widget.Toast;

/**
 * Created by 15031660 on 14/8/2017.
 */

public class WallpaperReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast my_toast = Toast.makeText(context, "You have changed the wallpaper" , Toast.LENGTH_LONG);
        my_toast.show();

    }
}
