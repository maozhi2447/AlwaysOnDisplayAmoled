package com.tomer.alwayson.Receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.tomer.alwayson.Prefs;
import com.tomer.alwayson.Services.StarterService;

/**
 * Created by tomer on 6/9/16.
 */

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Prefs prefs = new Prefs(context);
            if (prefs.enabled) {
                context.startService(new Intent(context, StarterService.class));
            }
        }
    }

}
