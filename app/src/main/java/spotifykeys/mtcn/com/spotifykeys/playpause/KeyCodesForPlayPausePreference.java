package spotifykeys.mtcn.com.spotifykeys.playpause;

import android.content.SharedPreferences;

import spotifykeys.mtcn.com.spotifykeys.framework.preferences.KeyCodesPreference;

/**
 * Created by COMPUTER on 2016-07-28.
 */
public class KeyCodesForPlayPausePreference extends KeyCodesPreference {
    public KeyCodesForPlayPausePreference(SharedPreferences sharedPreferences) {
        super(sharedPreferences);
    }

    @Override
    protected String getKeyPrefix() {
        return KEY_PREFIX;
    }

    private static final String KEY_PREFIX = "KeyCodesForPlayPause";
}
