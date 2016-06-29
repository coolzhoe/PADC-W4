package waiyan.padc_w4;

import android.app.Application;
import android.content.Context;

/**
 * Created by Coolz on 6/29/2016.
 */
public class W4App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
