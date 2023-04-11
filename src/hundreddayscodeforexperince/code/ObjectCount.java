package hundreddayscodeforexperince.code;

public class ObjectCount {
    private static int count = 0;

    public ObjectCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        ObjectCount obj1 = new ObjectCount();
        //ObjectCount obj2 = new ObjectCount();
        //ObjectCount obj3 = new ObjectCount();

        int count = ObjectCount.getCount();
        System.out.println("Total objects created: " + count); // output: Total objects created: 3
    }
}
