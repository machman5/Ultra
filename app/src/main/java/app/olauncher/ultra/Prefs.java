package app.olauncher.ultra;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.Gravity;

public class Prefs {

    private static final String PREF = "app.olauncher.ultra";

    private static final String APP_NAME_1 = "APP_NAME_1";
    private static final String APP_NAME_2 = "APP_NAME_2";
    private static final String APP_NAME_3 = "APP_NAME_3";
    private static final String APP_NAME_4 = "APP_NAME_4";
    private static final String APP_NAME_5 = "APP_NAME_5";
    private static final String APP_NAME_6 = "APP_NAME_6";
    private static final String APP_NAME_7 = "APP_NAME_7";
    private static final String APP_NAME_8 = "APP_NAME_8";
    private static final String APP_PACKAGE_1 = "APP_PACKAGE_1";
    private static final String APP_PACKAGE_2 = "APP_PACKAGE_2";
    private static final String APP_PACKAGE_3 = "APP_PACKAGE_3";
    private static final String APP_PACKAGE_4 = "APP_PACKAGE_4";
    private static final String APP_PACKAGE_5 = "APP_PACKAGE_5";
    private static final String APP_PACKAGE_6 = "APP_PACKAGE_6";
    private static final String APP_PACKAGE_7 = "APP_PACKAGE_7";
    private static final String APP_PACKAGE_8 = "APP_PACKAGE_8";
    private static final String APP_USER_HANDLE_1 = "APP_USER_HANDLE_1";
    private static final String APP_USER_HANDLE_2 = "APP_USER_HANDLE_2";
    private static final String APP_USER_HANDLE_3 = "APP_USER_HANDLE_3";
    private static final String APP_USER_HANDLE_4 = "APP_USER_HANDLE_4";
    private static final String APP_USER_HANDLE_5 = "APP_USER_HANDLE_5";
    private static final String APP_USER_HANDLE_6 = "APP_USER_HANDLE_6";
    private static final String APP_USER_HANDLE_7 = "APP_USER_HANDLE_7";
    private static final String APP_USER_HANDLE_8 = "APP_USER_HANDLE_8";


    private final SharedPreferences sharedPreferences;

    public Prefs(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF, Context.MODE_PRIVATE);
    }

    private SharedPreferences getSharedPref() {
        return sharedPreferences;
    }

    public String getAppName(int location) {
        switch (location) {
            case 1:
                return getSharedPref().getString(APP_NAME_1, "");
            case 2:
                return getSharedPref().getString(APP_NAME_2, "");
            case 3:
                return getSharedPref().getString(APP_NAME_3, "");
            case 4:
                return getSharedPref().getString(APP_NAME_4, "");
            case 5:
                return getSharedPref().getString(APP_NAME_5, "");
            case 6:
                return getSharedPref().getString(APP_NAME_6, "");
            case 7:
                return getSharedPref().getString(APP_NAME_7, "");
            case 8:
                return getSharedPref().getString(APP_NAME_8, "");
            default:
                return "";
        }
    }

    public String getAppPackage(int location) {
        switch (location) {
            case 1:
                return getSharedPref().getString(APP_PACKAGE_1, "");
            case 2:
                return getSharedPref().getString(APP_PACKAGE_2, "");
            case 3:
                return getSharedPref().getString(APP_PACKAGE_3, "");
            case 4:
                return getSharedPref().getString(APP_PACKAGE_4, "");
            case 5:
                return getSharedPref().getString(APP_PACKAGE_5, "");
            case 6:
                return getSharedPref().getString(APP_PACKAGE_6, "");
            case 7:
                return getSharedPref().getString(APP_PACKAGE_7, "");
            case 8:
                return getSharedPref().getString(APP_PACKAGE_8, "");
            default:
                return "";
        }
    }

    public String getAppUserHandle(int location) {
        switch (location) {
            case 1:
                return getSharedPref().getString(APP_USER_HANDLE_1, "");
            case 2:
                return getSharedPref().getString(APP_USER_HANDLE_2, "");
            case 3:
                return getSharedPref().getString(APP_USER_HANDLE_3, "");
            case 4:
                return getSharedPref().getString(APP_USER_HANDLE_4, "");
            case 5:
                return getSharedPref().getString(APP_USER_HANDLE_5, "");
            case 6:
                return getSharedPref().getString(APP_USER_HANDLE_6, "");
            case 7:
                return getSharedPref().getString(APP_USER_HANDLE_7, "");
            case 8:
                return getSharedPref().getString(APP_USER_HANDLE_8, "");
            default:
                return "";
        }
    }

    public void setHomeApp(MainActivity.AppModel app, int location) {
        switch (location) {
            case 1:
                getSharedPref().edit().putString(APP_NAME_1, app.appLabel).apply();
                getSharedPref().edit().putString(APP_PACKAGE_1, app.appPackage).apply();
                getSharedPref().edit().putString(APP_USER_HANDLE_1, app.userHandle.toString()).apply();
                break;
            case 2:
                getSharedPref().edit().putString(APP_NAME_2, app.appLabel).apply();
                getSharedPref().edit().putString(APP_PACKAGE_2, app.appPackage).apply();
                getSharedPref().edit().putString(APP_USER_HANDLE_2, app.userHandle.toString()).apply();
                break;
            case 3:
                getSharedPref().edit().putString(APP_NAME_3, app.appLabel).apply();
                getSharedPref().edit().putString(APP_PACKAGE_3, app.appPackage).apply();
                getSharedPref().edit().putString(APP_USER_HANDLE_3, app.userHandle.toString()).apply();
                break;
            case 4:
                getSharedPref().edit().putString(APP_NAME_4, app.appLabel).apply();
                getSharedPref().edit().putString(APP_PACKAGE_4, app.appPackage).apply();
                getSharedPref().edit().putString(APP_USER_HANDLE_4, app.userHandle.toString()).apply();
                break;
            case 5:
                getSharedPref().edit().putString(APP_NAME_5, app.appLabel).apply();
                getSharedPref().edit().putString(APP_PACKAGE_5, app.appPackage).apply();
                getSharedPref().edit().putString(APP_USER_HANDLE_5, app.userHandle.toString()).apply();
                break;
            case 6:
                getSharedPref().edit().putString(APP_NAME_6, app.appLabel).apply();
                getSharedPref().edit().putString(APP_PACKAGE_6, app.appPackage).apply();
                getSharedPref().edit().putString(APP_USER_HANDLE_6, app.userHandle.toString()).apply();
                break;
            case 7:
                getSharedPref().edit().putString(APP_NAME_7, app.appLabel).apply();
                getSharedPref().edit().putString(APP_PACKAGE_7, app.appPackage).apply();
                getSharedPref().edit().putString(APP_USER_HANDLE_7, app.userHandle.toString()).apply();
                break;
            case 8:
                getSharedPref().edit().putString(APP_NAME_8, app.appLabel).apply();
                getSharedPref().edit().putString(APP_PACKAGE_8, app.appPackage).apply();
                getSharedPref().edit().putString(APP_USER_HANDLE_8, app.userHandle.toString()).apply();
                break;
        }
    }
}
