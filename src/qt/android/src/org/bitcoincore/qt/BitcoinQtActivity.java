package org.blackcoincore.qt;

import android.os.Bundle;
import android.system.ErrnoException;
import android.system.Os;

import org.qtproject.qt5.android.bindings.QtActivity;

import java.io.File;

public class BlackcoinQtActivity extends QtActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        final File blackcoinDir = new File(getFilesDir().getAbsolutePath() + "/.blackcoin");
        if (!blackcoinDir.exists()) {
            blackcoinDir.mkdir();
        }

        super.onCreate(savedInstanceState);
    }
}
