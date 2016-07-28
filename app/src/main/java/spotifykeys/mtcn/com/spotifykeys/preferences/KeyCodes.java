package spotifykeys.mtcn.com.spotifykeys.preferences;

import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by COMPUTER on 2016-07-28.
 */
public abstract class KeyCodes extends Preference<Set<String>> {
    public KeyCodes(SharedPreferences sharedPreferences) {
        super(sharedPreferences);
    }

    public void insert(int keyCode) throws CommitFailedException {
        Set<String> keyCodes = read();
        keyCodes.add(Integer.toString(keyCode));
        set(keyCodes);
    }

    public void remove(int keyCode) throws CommitFailedException {
        Set<String> keyCodes = read();
        keyCodes.remove(Integer.toString(keyCode));
        set(keyCodes);
    }

    @Override
    protected Set<String> read() {
        return new HashSet<>(mSharedPreferences.getStringSet(getKeyPrefix(), DEFAULT_VALUE)); // According to Android DOCs, we should return copy :(
    }

    @Override
    protected void write(Set<String> value) {
        mEditor.putStringSet(getKeyPrefix(), value);
    }

    private static final Set<String> DEFAULT_VALUE = new HashSet<>();
}
