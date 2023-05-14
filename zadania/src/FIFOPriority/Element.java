package FIFOPriority;

public class Element {
    private String element;
    private int Priority;

    public Element(String element, int priority) {
        if(priority>0 && priority<100) {
            this.element = element;
            Priority = priority;
        }
        else {
            System.out.println("Piorytety od 1 do 99. Nie dodano do kolejki");
        }
    }

    public String getElement() {
        return element;
    }

    public Element() {
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("String: ")
                .append(getElement())
                .append(", Priority: ")
                .append(getPriority())
                .toString();
    }

}
