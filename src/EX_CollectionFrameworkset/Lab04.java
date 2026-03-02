package CollectionFrameworkset;

    import java.util.TreeSet;

    public class Lab04 {
        public static void main(String[] args) {
            TreeSet numSet = new TreeSet();
            numSet.add(50);
            numSet.add(20);
            numSet.add(10);
            numSet.add(10);
            numSet.add("Pramod"); // java.lang.ClassCastException
            System.out.println(numSet);
        }
    }

