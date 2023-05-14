package FIFOPriority;

import java.util.ArrayList;
import java.util.List;

public class FIFOPriority {
    private final List<Element> list = new ArrayList<>();
    private FIFOPriority() {}
    public static final FIFOPriority instance = new FIFOPriority();
    public void push(String element, int priority) {
        list.add(new Element(element,priority));
    }
    public String popFirst() {
        if(this.list.isEmpty()) {return null;}
        String temp = this.list.get(0).toString();
        this.list.remove(0);
        return temp;
    }
    public String popHighest(){
        if(this.list.isEmpty()) {return null;}
        int k = popHighestRek(0, list.size()-1, 0,list.size()-1 );
        Element temp = list.get(k);
        this.list.remove(k);
        return temp.toString();
    }
    public int popHighestRek(int start, int end, int temp, int index){
        if(start==end){return index;}
        if(list.get(start).getPriority()>temp){
            temp = list.get(start).getPriority();
            index = start;
        }
        return popHighestRek(start+1, end, temp, index);
    }
    public String popHighThree() {
        if (this.list.isEmpty()) {return null;}
        int k = popHighestRek(0,3,0,0 );
        Element temp = list.get(k);
        this.list.remove(k);
        return temp.toString();
    }
        public static FIFOPriority getInstance(){
        return instance;
        }
}
