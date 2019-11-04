package model.file;

/**
 * 04.11.2019
 * model
 *
 * @author Talochka Pavel
 */
public abstract class BaseFile {
    String name;
    String puthfile;
    public abstract String getStrream();

    public void setName(String name) {
        this.name = name;
    }

    public void setPuthfile(String puthfile) {
        this.puthfile = puthfile;
    }

    public String getName() {
        return name;
    }

    public String getPuthfile() {
        return puthfile;
    }
}
