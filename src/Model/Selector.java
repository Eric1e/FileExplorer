package Model;

import java.io.File;
import java.util.List;

public interface Selector {

    public File select(String string);

    public List<File> multiSelect();

}
