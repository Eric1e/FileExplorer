package Model;

import Model.Selector;

import java.io.File;

public class SelectorImpl implements Selector {

    @Override
    public File select(String string) {
        return new File(string);
    }

}
