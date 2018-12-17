package Model;

import Model.Selector;

import java.io.File;
import java.util.List;

public class SelectorImpl implements Selector {

    @Override
    public File select(String string) {

        return new File(string);
    }

    @Override
    public List<File> multiSelect() {

        return null;
    }

}
