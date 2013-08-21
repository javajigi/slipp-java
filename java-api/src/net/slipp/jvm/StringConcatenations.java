package net.slipp.jvm;

public class StringConcatenations {
    public String concat1(String start, String end) {
        return start + end;
    }
    
    public void concat2(StringBuffer start, String end) {
        start.append(end);
    }
}
