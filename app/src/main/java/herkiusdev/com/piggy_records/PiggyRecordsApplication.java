package herkiusdev.com.piggy_records;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class PiggyRecordsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }

}
