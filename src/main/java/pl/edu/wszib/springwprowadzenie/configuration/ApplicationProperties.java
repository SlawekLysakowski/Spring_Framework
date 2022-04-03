package pl.edu.wszib.springwprowadzenie.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "asdf")
public class ApplicationProperties {

    private String test;
    private Integer number;
    private int whatWillHappen = 0;

    private SuperClass superClass = new SuperClass();

    public void setSuperClass(SuperClass superClass) {
        this.superClass = superClass;
    }



    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public int getWhatWillHappen() {
        return whatWillHappen;
    }

    public void setWhatWillHappen(int whatWillHappen) {
        this.whatWillHappen = whatWillHappen;
    }

    public SuperClass getSuperClass() {
        return superClass;
    }



    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }



    public class SuperClass {
        private String test2;

        public String getTest2() {
            return test2;
        }

        public void setTest2(String test2) {
            this.test2 = test2;
        }
    }
}
